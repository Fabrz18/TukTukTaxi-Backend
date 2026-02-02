package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.DriverDTO;
import com.bitraid.tuktuktaxi.interfaces.IDriverService;

import java.util.List;

public class DriverService implements IDriverService {
    @Override
    public DriverDTO createDriver(DriverDTO driverDTO) {
        return null;
    }

    @Override
    public DriverDTO updateDriver(DriverDTO driverDTO) {
        return null;
    }

    @Override
    public Integer deleteDriver(Integer id) {
        return 0;
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        return List.of();
    }

    @Override
    public DriverDTO getDriverById(Integer id) {
        return null;
    }
}
