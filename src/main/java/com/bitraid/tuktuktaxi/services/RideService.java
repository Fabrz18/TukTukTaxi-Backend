package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.RideDTO;
import com.bitraid.tuktuktaxi.entities.Ride;
import com.bitraid.tuktuktaxi.interfaces.IRideService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService implements IRideService {
    @Override
    public RideDTO registerRide(Ride ride) {
        return null;
    }

    @Override
    public List<RideDTO> listRidesByDriver(Integer driverId) {
        return List.of();
    }

    @Override
    public List<RideDTO> listRidesByPassenger(Integer passengerId) {
        return List.of();
    }

    @Override
    public List<RideDTO> getAllRides() {
        return List.of();
    }

    @Override
    public List<RideDTO> listRidesByRate(Double rate) {
        return List.of();
    }
}
