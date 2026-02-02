package com.bitraid.tuktuktaxi.interfaces;

import com.bitraid.tuktuktaxi.dtos.RideDTO;
import com.bitraid.tuktuktaxi.entities.Ride;

import java.util.List;

public interface IRideService {
    RideDTO registerRide(Ride ride);
    List<RideDTO> listRidesByDriver(Integer driverId);
    List<RideDTO> listRidesByPassenger(Integer passengerId);
    List<RideDTO> getAllRides();
    List<RideDTO> listRidesByRate(Double rate);
}
