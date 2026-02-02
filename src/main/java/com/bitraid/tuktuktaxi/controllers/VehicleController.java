package com.bitraid.tuktuktaxi.controllers;

import com.bitraid.tuktuktaxi.dtos.VehicleDTO;
import com.bitraid.tuktuktaxi.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/register")
    @PreAuthorize("hasAnyRole('CONDUCTOR')")
    public ResponseEntity<VehicleDTO> createVehicle(@RequestBody VehicleDTO vehicleDTO) {
        VehicleDTO newVehicle = vehicleService.createVehicle(vehicleDTO);
        return ResponseEntity.ok(newVehicle);
    }

    @PutMapping("/update")
    @PreAuthorize("hasAnyRole('CONDUCTOR')")
    public ResponseEntity<VehicleDTO> updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
        VehicleDTO updatedVehicle = vehicleService.updateVehicle(vehicleDTO);
        return ResponseEntity.ok(updatedVehicle);
    }

    @GetMapping("/list/{id}")
    @PreAuthorize("hasAnyRole('CONDUCTOR')")
    public ResponseEntity<VehicleDTO> getVehicleById(@PathVariable Long id) {
        VehicleDTO vehicle = vehicleService.getVehicleById(id);
        if (vehicle == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(vehicle);
    }

    @GetMapping("/listall")
    @PreAuthorize("hasAnyRole('CONDUCTOR')")
    public ResponseEntity<List<VehicleDTO>> getAllVehicles() {
        List<VehicleDTO> vehicles = vehicleService.getAllVehicles();
        if (vehicles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vehicles);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyRole('CONDUCTOR')")
    public void deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);

    }
}
