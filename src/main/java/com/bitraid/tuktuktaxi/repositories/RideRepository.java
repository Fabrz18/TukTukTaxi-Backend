package com.bitraid.tuktuktaxi.repositories;

import com.bitraid.tuktuktaxi.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RideRepository extends JpaRepository<Ride, Long> {
    List<Ride> findAllByDriver_Id(Long driverId);

    List<Ride> findAllByPassenger_Id(Long passengerId);

    List<Ride> findAllByRate(Double rate);
}
