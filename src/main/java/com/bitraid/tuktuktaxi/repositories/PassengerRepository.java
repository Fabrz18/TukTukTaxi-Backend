package com.bitraid.tuktuktaxi.repositories;

import com.bitraid.tuktuktaxi.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
}
