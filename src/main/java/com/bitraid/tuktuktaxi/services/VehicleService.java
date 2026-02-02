package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.VehicleDTO;
import com.bitraid.tuktuktaxi.interfaces.IVehicleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService {
    @Override
    public VehicleDTO createVehicle(VehicleDTO vehicle) {
        return null;
    }

    @Override
    public VehicleDTO updateVehicle(VehicleDTO vehicle) {
        return null;
    }

    @Override
    public VehicleDTO deleteVehicle(Long id) {
        return null;
    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return List.of();
    }

    @Override
    public VehicleDTO getVehicleById(String id) {
        return null;
    }
}
