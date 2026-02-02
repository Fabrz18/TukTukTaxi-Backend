package com.bitraid.tuktuktaxi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

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
    private Passenger idpassenger;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "iddriver", nullable = false)
    private Driver iddriver;

    @Column(name = "distance", nullable = false, precision = 10, scale = 2)
    private BigDecimal distance;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "cost", nullable = false, precision = 10, scale = 2)
    private BigDecimal cost;

    @Column(name = "originadrdess", nullable = false, length = Integer.MAX_VALUE)
    private String originadrdess;

    @Column(name = "originlat", nullable = false)
    private Double originlat;

    @Column(name = "originlong", nullable = false)
    private Double originlong;

    @Column(name = "destinityaddress", nullable = false, length = Integer.MAX_VALUE)
    private String destinityaddress;

    @Column(name = "destinylat", nullable = false)
    private Double destinylat;

    @Column(name = "destinylong", nullable = false)
    private Double destinylong;

    @Column(name = "rate", precision = 3, scale = 1)
    private BigDecimal rate;

}