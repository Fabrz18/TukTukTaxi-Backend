package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.PassengerDTO;
import com.bitraid.tuktuktaxi.entities.Passenger;
import com.bitraid.tuktuktaxi.interfaces.IPassengerService;
import com.bitraid.tuktuktaxi.repositories.PassengerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService implements IPassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PassengerDTO createPassenger(PassengerDTO passengerDTO) {
        if (passengerDTO.getId() == null) {
            Passenger passenger = modelMapper.map(passengerDTO, Passenger.class);
            passenger.setStatus(true);
            passengerRepository.save(passenger);
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
