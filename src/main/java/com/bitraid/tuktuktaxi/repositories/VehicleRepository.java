package com.bitraid.tuktuktaxi.repositories;

import com.bitraid.tuktuktaxi.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
