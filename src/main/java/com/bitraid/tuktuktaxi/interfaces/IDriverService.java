package com.bitraid.tuktuktaxi.interfaces;

import com.bitraid.tuktuktaxi.dtos.DriverDTO;

import java.util.List;

public interface IDriverService {
    public DriverDTO createDriver(DriverDTO driverDTO);
    public DriverDTO updateDriver(DriverDTO driverDTO);
    public Integer deleteDriver(Integer id);
    public List<DriverDTO> getAllDrivers();
    public DriverDTO getDriverById(Integer id);
}
