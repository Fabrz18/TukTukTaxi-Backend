package com.bitraid.tuktuktaxi.dtos;

import com.bitraid.tuktuktaxi.entities.Vehicle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {
    private Integer id;
    private Vehicle idvehicle;
    private String dni;
    private String fullname;
    private String bikeplate;
    private String phonenumber;
    private String email;
    private BigDecimal rate;
    private BigDecimal balance;
}
