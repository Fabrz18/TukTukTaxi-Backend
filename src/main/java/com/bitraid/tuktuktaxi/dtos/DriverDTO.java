package com.bitraid.tuktuktaxi.dtos;

import com.bitraid.tuktuktaxi.entities.Vehicle;
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
    private String password;
    private String fullName;
    private String dni;
    private String bikePlate;
    private String phoneNumber;
    private String email;
    private Double rate;
    private Double balance;
    private Boolean status;
}
