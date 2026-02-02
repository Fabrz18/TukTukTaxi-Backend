package com.bitraid.tuktuktaxi.services;

import com.bitraid.tuktuktaxi.dtos.PassengerDTO;
import com.bitraid.tuktuktaxi.interfaces.IPassengerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService implements IPassengerService {
    @Override
    public PassengerDTO createPassenger(PassengerDTO passengerDTO) {
        return null;
    }

    @Override
    public PassengerDTO updatePassenger(PassengerDTO passengerDTO) {
        return null;
    }

    @Override
    public Integer deletePassenger(Integer id) {
        return 0;
    }

    @Override
    public List<PassengerDTO> getAllPassengers() {
        return List.of();
    }

    @Override
    public PassengerDTO getPassengerById(Integer id) {
        return null;
    }
}
