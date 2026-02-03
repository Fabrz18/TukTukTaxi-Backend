package com.bitraid.tuktuktaxi.dtos;

import com.bitraid.tuktuktaxi.entities.Vehicle;
import com.bitraid.tuktuktaxi.security.entities.Role;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {
    private Long id;
    private Vehicle vehicle;
    private String dni;
    private String fullName;
    private String bikePlate;
    private String phoneNumber;
    private String password;
    private String email;
    private Double rate;
    private Double balance;
    private Boolean status;
}
