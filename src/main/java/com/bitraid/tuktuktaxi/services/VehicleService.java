package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.VehicleDTO;
import com.bitraid.tuktuktaxi.entities.Vehicle;
import com.bitraid.tuktuktaxi.interfaces.IVehicleService;
import com.bitraid.tuktuktaxi.repositories.VehicleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Autowired
    public ModelMapper modelMapper;

    @Override
    public VehicleDTO createVehicle(VehicleDTO vehicleDTO) {
        if (vehicleDTO.getId() == null) {
            Vehicle vehicle = modelMapper.map(vehicleDTO, Vehicle.class);
            vehicleRepository.save(vehicle);
            return modelMapper.map(vehicle, VehicleDTO.class);
        }
        return null;
    }

    @Override
    public VehicleDTO updateVehicle(VehicleDTO vehicleDTO) {
        if (vehicleDTO.getId() != null) {
            Vehicle vehicle = modelMapper.map(vehicleDTO, Vehicle.class);
            vehicleRepository.save(vehicle);
            return modelMapper.map(vehicle, VehicleDTO.class);
        }
        return null;
    }

    @Override
    public void deleteVehicle(Long id) {
        if (vehicleRepository.existsById(id)) {
            vehicleRepository.deleteById(id);
        }
        throw new EntityNotFoundException("Vehicle with id " + id + " not found");
    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        List<Vehicle> vehicles = vehicleRepository.findAll();
        return vehicles.stream().map(x -> modelMapper.map(x, VehicleDTO.class)).toList();
    }

    @Override
    public VehicleDTO getVehicleById(Long id) {
        Vehicle vehicle = vehicleRepository.findById(id).orElse(null);
        return modelMapper.map(vehicle, VehicleDTO.class);
    }
}
