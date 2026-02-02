package com.bitraid.tuktuktaxi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idvehicle", nullable = false)
    private Vehicle idvehicle;

    @Column(name = "dni", nullable = false, length = Integer.MAX_VALUE)
    private String dni;

    @Column(name = "fullname", nullable = false, length = Integer.MAX_VALUE)
    private String fullname;

    @Column(name = "bikeplate", nullable = false, length = Integer.MAX_VALUE)
    private String bikeplate;

    @Column(name = "phonenumber", nullable = false, length = Integer.MAX_VALUE)
    private String phonenumber;

    @Column(name = "email", nullable = false, length = Integer.MAX_VALUE)
    private String email;

    @ColumnDefault("5.0")
    @Column(name = "rate", nullable = false, precision = 3, scale = 1)
    private BigDecimal rate;

    @ColumnDefault("0.00")
    @Column(name = "balance", nullable = false, precision = 10, scale = 2)
    private BigDecimal balance;

}