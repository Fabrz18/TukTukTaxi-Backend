package com.bitraid.tuktuktaxi.interfaces;


import com.bitraid.tuktuktaxi.dtos.PassengerDTO;

import java.util.List;

public interface IPassengerService {
    PassengerDTO createPassenger(PassengerDTO passengerDTO);
    PassengerDTO updatePassenger(PassengerDTO passengerDTO);
    void deletePassenger(Long id);
    List<PassengerDTO> getAllPassengers();
    PassengerDTO getPassengerById(Long id);
}
