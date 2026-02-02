package com.bitraid.tuktuktaxi.controllers;

import com.bitraid.tuktuktaxi.entities.Ride;
import com.bitraid.tuktuktaxi.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/driver")
public class DriverController {
    @Autowired
    private RideService rideService;

    @PostMapping("/register")
    public ResponseEntity<?> registerDriver(@RequestBody Ride ride){
        return null;
    }
    

}
