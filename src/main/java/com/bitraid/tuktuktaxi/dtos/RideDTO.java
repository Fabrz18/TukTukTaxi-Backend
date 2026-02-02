package com.bitraid.tuktuktaxi.dtos;

import com.bitraid.tuktuktaxi.entities.Driver;
import com.bitraid.tuktuktaxi.entities.Passenger;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RideDTO {
    private Integer id;
    private Passenger idpassenger;
    private Driver iddriver;
    private BigDecimal distance;
    private Instant date;
    private BigDecimal cost;
    private String originadrdess;
    private Double originlat;
    private Double originlong;
    private String destinityaddress;
    private Double destinylat;
    private Double destinylong;
    private BigDecimal rate;
}
