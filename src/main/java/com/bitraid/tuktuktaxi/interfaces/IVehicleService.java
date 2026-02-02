package com.bitraid.tuktuktaxi.interfaces;

import com.bitraid.tuktuktaxi.dtos.VehicleDTO;

import java.util.List;

public interface IVehicleService {
    VehicleDTO createVehicle(VehicleDTO vehicle);
    VehicleDTO updateVehicle(VehicleDTO vehicle);
    void deleteVehicle(Long id);
    List<VehicleDTO> getAllVehicles();
    VehicleDTO getVehicleById(Long id);
}
