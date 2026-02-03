package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.PassengerDTO;
import com.bitraid.tuktuktaxi.entities.Passenger;
import com.bitraid.tuktuktaxi.interfaces.IPassengerService;
import com.bitraid.tuktuktaxi.repositories.PassengerRepository;
import com.bitraid.tuktuktaxi.security.entities.Role;
import com.bitraid.tuktuktaxi.security.entities.User;
import com.bitraid.tuktuktaxi.security.repository.RoleRepository;
import com.bitraid.tuktuktaxi.security.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PassengerService implements IPassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public PassengerDTO createPassenger(PassengerDTO passengerDTO) {
        User user = new User();
        if (passengerDTO.getId() == null) {
            Passenger passenger = modelMapper.map(passengerDTO, Passenger.class);
            passenger.setStatus(true);
            // Guardandolo en el security
            user.setUsername(passengerDTO.getEmail());
            user.setPassword(passwordEncoder.encode(passengerDTO.getPassword()));

            Role rol =  new Role();
            rol.setId(1L);
            rol.setName("ROLE_PASSENGER");

            // Asumiendo que tu entidad User tiene una lista de roles
            user.setRoles(Collections.singleton(rol));
            passengerRepository.save(passenger);
            userRepository.save(user);
            roleRepository.save(rol);
            return modelMapper.map(passenger, PassengerDTO.class);
        }
        return null;
    }

    @Override
    public PassengerDTO updatePassenger(PassengerDTO passengerDTO) {
        if (passengerDTO.getId() != null) {
            Passenger passenger = modelMapper.map(passengerDTO, Passenger.class);
            passengerRepository.save(passenger);
            return modelMapper.map(passenger, PassengerDTO.class);
        }
        return null;
    }

    @Override
    public void deletePassenger(Long id) {
        if (passengerRepository.existsById(id)) {
            Passenger passenger = passengerRepository.getOne(id);
            passenger.setStatus(false);
        }
        throw new EntityNotFoundException("Passenger with id " + id + " not found");
    }

    @Override
    public List<PassengerDTO> getAllPassengers() {
        List<Passenger> passengers = passengerRepository.findAll();
        return passengers.stream().map(x -> modelMapper.map(x, PassengerDTO.class)).toList();
    }

    @Override
    public PassengerDTO getPassengerById(Long id) {
        Passenger passenger = passengerRepository.findById(id).orElse(null);
        return modelMapper.map(passenger, PassengerDTO.class);
    }
}
