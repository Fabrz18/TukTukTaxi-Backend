package com.bitraid.tuktuktaxi.controllers;

import com.bitraid.tuktuktaxi.dtos.RideDTO;
import com.bitraid.tuktuktaxi.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ride")
public class RideController {
    @Autowired
    private RideService rideService;

    @PostMapping("/register")
    public ResponseEntity<RideDTO> registerRide(@RequestBody RideDTO rideDTO) {
        // Asumiendo que tu servicio transforma el DTO a Entity internamente
        RideDTO newRide = rideService.registerRide(rideDTO);
        return ResponseEntity.ok(newRide);
    }

    @GetMapping("/list/driver/{driverId}")
    public ResponseEntity<List<RideDTO>> listRidesByDriver(@PathVariable Long driverId) {
        List<RideDTO> rides = rideService.listRidesByDriver(driverId);
        if (rides.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(rides);
    }

    @GetMapping("/list/passenger/{passengerId}")
    public ResponseEntity<List<RideDTO>> listRidesByPassenger(@PathVariable Long passengerId) {
        List<RideDTO> rides = rideService.listRidesByPassenger(passengerId);
        if (rides.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(rides);
    }

    @GetMapping("/listall")
    public ResponseEntity<List<RideDTO>> getAllRides() {
        List<RideDTO> rides = rideService.getAllRides();
        if (rides.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(rides);
    }

    @GetMapping("/list/rate/{rate}")
    public ResponseEntity<List<RideDTO>> listRidesByRate(@PathVariable Double rate) {
        List<RideDTO> rides = rideService.listRidesByRate(rate);
        if (rides.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(rides);
    }
}
