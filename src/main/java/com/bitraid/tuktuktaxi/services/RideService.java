package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.RideDTO;
import com.bitraid.tuktuktaxi.entities.Ride;
import com.bitraid.tuktuktaxi.interfaces.IRideService;
import com.bitraid.tuktuktaxi.repositories.RideRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService implements IRideService {
    @Autowired
    private RideRepository rideRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RideDTO registerRide(RideDTO rideDTO) {
        if (rideDTO == null) {
            Ride ride = modelMapper.map(rideDTO, Ride.class);
            rideRepository.save(ride);
            return modelMapper.map(ride, RideDTO.class);
        }
        return null;
    }

    @Override
    public List<RideDTO> listRidesByDriver(Long driverId) {
        List<Ride> rides = rideRepository.findAllByDriver_Id(driverId);
        return rides.stream().map(x -> modelMapper.map(x, RideDTO.class)).toList();
    }

    @Override
    public List<RideDTO> listRidesByPassenger(Long passengerId) {
        List<Ride> rides = rideRepository.findAllByPassenger_Id(passengerId);
        return rides.stream().map(x -> modelMapper.map(x, RideDTO.class)).toList();
    }

    @Override
    public List<RideDTO> getAllRides() {
        List<Ride> rides = rideRepository.findAll();
        return rides.stream().map(x -> modelMapper.map(x, RideDTO.class)).toList();
    }

    @Override
    public List<RideDTO> listRidesByRate(Double rate) {
        List<Ride> rides = rideRepository.findAllByRate(rate);
        return rides.stream().map(x -> modelMapper.map(x, RideDTO.class)).toList();
    }
}
