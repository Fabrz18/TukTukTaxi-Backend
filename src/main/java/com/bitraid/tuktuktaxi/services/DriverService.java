package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.DriverDTO;
import com.bitraid.tuktuktaxi.entities.Driver;
import com.bitraid.tuktuktaxi.interfaces.IDriverService;
import com.bitraid.tuktuktaxi.repositories.DriverRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements IDriverService {
    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DriverDTO createDriver(DriverDTO driverDTO) {
        if (driverDTO == null) {
            Driver driver = modelMapper.map(driverDTO, Driver.class);
            driverRepository.save(driver);
            return modelMapper.map(driver, DriverDTO.class);
        }
        return null;
    }

    @Override
    public DriverDTO updateDriver(DriverDTO driverDTO) {
        if (driverDTO != null) {
            Driver driver = modelMapper.map(driverDTO, Driver.class);
            driverRepository.save(driver);
            return modelMapper.map(driver, DriverDTO.class);
        }
        return null;
    }

    @Override
    public void deleteDriver(Long id) {
        if (driverRepository.existsById(id)) {
            driverRepository.deleteById(id);
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
