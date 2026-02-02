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
    private Integer id;
    private String dni;
    private String fullname;
    private String phonenumber;
    private String email;
}
