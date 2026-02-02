package com.bitraid.tuktuktaxi.interfaces;

import com.bitraid.tuktuktaxi.dtos.RideDTO;
import com.bitraid.tuktuktaxi.entities.Ride;

public interface IRideService {
    RideDTO registerRide(Ride ride);
    RideDTO listRidesByDriver(Ride ride);
    RideDTO listRidesByPassenger(Ride ride);
    RideDTO listRidesByRate(Ride ride);
}
