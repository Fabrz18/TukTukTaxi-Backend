package com.bitraid.tuktuktaxi.interfaces;

import com.bitraid.tuktuktaxi.dtos.DriverDTO;

import java.util.List;

public interface IDriverService {
    DriverDTO createDriver(DriverDTO driverDTO);
    DriverDTO updateDriver(DriverDTO driverDTO);
    Integer deleteDriver(Integer id);
    List<DriverDTO> getAllDrivers();
    DriverDTO getDriverById(Integer id);
}
