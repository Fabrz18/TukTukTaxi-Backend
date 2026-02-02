package com.bitraid.tuktuktaxi.security.repository;


import com.bitraid.tuktuktaxi.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
