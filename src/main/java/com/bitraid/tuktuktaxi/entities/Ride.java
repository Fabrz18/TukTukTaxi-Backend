package com.bitraid.tuktuktaxi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "rides")
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idpassenger", nullable = false)
    private Passenger passenger;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iddriver", nullable = false)
    private Driver driver;

    @Column(name = "distance", nullable = false, precision = 10, scale = 2)
    private Double distance;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "cost", nullable = false, precision = 10, scale = 2)
    private Double cost;

    @Column(name = "originadrdess", nullable = false, length = Integer.MAX_VALUE)
    private String originAddress;

    @Column(name = "originlat", nullable = false)
    private Double originLat;

    @Column(name = "originlong", nullable = false)
    private Double originLong;

    @Column(name = "destinityaddress", nullable = false, length = Integer.MAX_VALUE)
    private String destinityAddress;

    @Column(name = "destinylat", nullable = false)
    private Double destinyLat;

    @Column(name = "destinylong", nullable = false)
    private Double destinyLong;

    @Column(name = "rate", precision = 3, scale = 1)
    private Double rate;

}