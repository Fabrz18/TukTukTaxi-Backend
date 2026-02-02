package com.bitraid.tuktuktaxi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vehicules")
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "model", nullable = false, length = Integer.MAX_VALUE)
    private String model;

    @Column(name = "brand", nullable = false, length = Integer.MAX_VALUE)
    private String brand;

}