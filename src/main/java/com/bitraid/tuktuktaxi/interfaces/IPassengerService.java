package com.bitraid.tuktuktaxi.interfaces;


import com.bitraid.tuktuktaxi.dtos.PassengerDTO;

import java.util.List;

public interface IPassengerService {
    PassengerDTO createPassenger(PassengerDTO passengerDTO);
    PassengerDTO updatePassenger(PassengerDTO passengerDTO);
    Integer deletePassenger(Integer id);
    List<PassengerDTO> getAllPassengers();
    PassengerDTO getPassengerById(Integer id);
}
