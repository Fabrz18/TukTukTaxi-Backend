package com.bitraid.tuktuktaxi.repositories;

import com.bitraid.tuktuktaxi.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    boolean existsByEmail(String email);
}
