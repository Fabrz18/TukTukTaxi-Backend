package com.bitraid.tuktuktaxi.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDTO {
    private Long id;
    private String dni;
    private String fullName;
    private String phoneNumber;
    private String email;
}
