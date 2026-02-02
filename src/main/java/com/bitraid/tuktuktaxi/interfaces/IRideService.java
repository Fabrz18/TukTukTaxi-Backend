package com.bitraid.tuktuktaxi.interfaces;

import com.bitraid.tuktuktaxi.dtos.RideDTO;
import com.bitraid.tuktuktaxi.entities.Ride;

import java.util.List;

public interface IRideService {
    RideDTO registerRide(RideDTO rideDTO);
    List<RideDTO> listRidesByDriver(Long driverId);
    List<RideDTO> listRidesByPassenger(Long passengerId);
    List<RideDTO> getAllRides();
    List<RideDTO> listRidesByRate(Double rate);
}
