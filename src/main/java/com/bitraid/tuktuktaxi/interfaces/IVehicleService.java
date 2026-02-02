package com.bitraid.tuktuktaxi.interfaces;

import com.bitraid.tuktuktaxi.dtos.VehicleDTO;

public interface IVehicleService {
    VehicleDTO createVehicle(VehicleDTO vehicle);
    VehicleDTO updateVehicle(VehicleDTO vehicle);
    VehicleDTO deleteVehicle(Long id);
    VehicleDTO getVehicle(Long id);
    VehicleDTO getVehicleById(String id);
}
