package com.bitraid.tuktuktaxi.controllers;

import com.bitraid.tuktuktaxi.dtos.DriverDTO;
import com.bitraid.tuktuktaxi.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/driver")
public class DriverController {
        @Autowired
        private DriverService driverService;

        @PostMapping("/register")
        public ResponseEntity<DriverDTO> createDriver(@RequestBody DriverDTO driverDTO) {
            DriverDTO newDriver = driverService.createDriver(driverDTO);
            return ResponseEntity.ok(newDriver);
        }

        @PutMapping("/update")
        public ResponseEntity<DriverDTO> updateDriver(@RequestBody DriverDTO driverDTO) {
            DriverDTO updatedDriver = driverService.updateDriver(driverDTO);
            return ResponseEntity.ok(updatedDriver);
        }

        @GetMapping("/list/{id}")
        public ResponseEntity<DriverDTO> getDriverById(@PathVariable Long id) {
            DriverDTO driver = driverService.getDriverById(id);
            if (driver == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(driver);
        }

        @GetMapping("/listall")
        public ResponseEntity<List<DriverDTO>> getAllDrivers() {
            List<DriverDTO> drivers = driverService.getAllDrivers();
            if (drivers.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(drivers);
        }

        @DeleteMapping("/delete/{id}")
        public void deleteDriver(@PathVariable Long id) {
            driverService.deleteDriver(id);
        }

}
