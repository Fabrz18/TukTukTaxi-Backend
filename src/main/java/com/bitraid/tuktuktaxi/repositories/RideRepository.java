package com.bitraid.tuktuktaxi.repositories;

import com.bitraid.tuktuktaxi.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Integer> {
}
