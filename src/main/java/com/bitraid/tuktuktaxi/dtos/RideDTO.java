package com.bitraid.tuktuktaxi.dtos;

import com.bitraid.tuktuktaxi.entities.Driver;
import com.bitraid.tuktuktaxi.entities.Passenger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RideDTO {
    private Long id;
    private Passenger passenger;
    private Driver driver;
    private Double distance;
    private LocalDateTime date;
    private Double cost;
    private String originAddress;
    private Double originLat;
    private Double originLong;
    private String destinityAddress;
    private Double destinyLat;
    private Double destinyLong;
    private Double rate;
}
