package com.bitraid.tuktuktaxi.controllers;

import com.bitraid.tuktuktaxi.dtos.PassengerDTO;
import com.bitraid.tuktuktaxi.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @PostMapping("/register")
    public ResponseEntity<PassengerDTO> createPassenger(@RequestBody PassengerDTO passengerDTO) {
        PassengerDTO newPassenger = passengerService.createPassenger(passengerDTO);
        return ResponseEntity.ok(newPassenger);
    }

    @PutMapping("/update")
    @PreAuthorize("hasRole('PASAJERO')")
    public ResponseEntity<PassengerDTO> updatePassenger(@RequestBody PassengerDTO passengerDTO) {
        PassengerDTO updatedPassenger = passengerService.updatePassenger(passengerDTO);
        return ResponseEntity.ok(updatedPassenger);
    }

    @GetMapping("/list/{id}")
    @PreAuthorize("hasAnyRole('CONDUCTOR', 'PASAJERO')")
    public ResponseEntity<PassengerDTO> getPassengerById(@PathVariable Long id) {
        PassengerDTO passenger = passengerService.getPassengerById(id);
        if (passenger == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(passenger);
    }

    @GetMapping("/listall")
    @PreAuthorize("hasAnyRole('CONDUCTOR', 'PASAJERO')")
    public ResponseEntity<List<PassengerDTO>> getAllPassengers() {
        List<PassengerDTO> passengers = passengerService.getAllPassengers();
        if (passengers.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(passengers);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyRole('PASAJERO')")
    public void deletePassenger(@PathVariable Long id) {
        passengerService.deletePassenger(id);
    }
}
