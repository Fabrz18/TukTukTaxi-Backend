package com.bitraid.tuktuktaxi.security.repository;


import com.kubotoys.inversioneskubotoys.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
