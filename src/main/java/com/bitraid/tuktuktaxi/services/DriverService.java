package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.DriverDTO;
import com.bitraid.tuktuktaxi.entities.Driver;
import com.bitraid.tuktuktaxi.interfaces.IDriverService;
import com.bitraid.tuktuktaxi.repositories.DriverRepository;
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
public class DriverService implements IDriverService {
    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public DriverDTO createDriver(DriverDTO driverDTO) {
        User user = new User();
        if (driverDTO.getId() == null) {
            Driver driver = modelMapper.map(driverDTO, Driver.class);
            driver.setStatus(true);
            driver.setRate(0.0);

            // Guardandolo en el security
            user.setUsername(driverDTO.getEmail());
            user.setPassword(passwordEncoder.encode(driverDTO.getPassword()));

            Role rol =  new Role();
            rol.setId(2L);
            rol.setName("ROLE_CONDUCTOR");

            // Asumiendo que tu entidad User tiene una lista de roles
            user.setRoles(Collections.singleton(rol));
            driverRepository.save(driver);
            userRepository.save(user);
            roleRepository.save(rol);
            return modelMapper.map(driver, DriverDTO.class);
        }
        return null;
    }

    @Override
    public DriverDTO updateDriver(DriverDTO driverDTO) {
        if (driverDTO.getId() != null) {
            Driver driver = modelMapper.map(driverDTO, Driver.class);
            driverRepository.save(driver);
            return modelMapper.map(driver, DriverDTO.class);
        }
        return null;
    }

    @Override
    public void deleteDriver(Long id) {
        if (driverRepository.existsById(id)) {
            Driver driver = driverRepository.getOne(id);
            driver.setStatus(false);
        }
        throw new EntityNotFoundException("Driver with id " + id + " not found");
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        List<Driver> drivers = driverRepository.findAll();
        return drivers.stream().map(x -> modelMapper.map(x, DriverDTO.class)).toList();
    }

    @Override
    public DriverDTO getDriverById(Long id) {
        Driver driver = driverRepository.findById(id).orElse(null);
        return modelMapper.map(driver, DriverDTO.class);
    }
}
