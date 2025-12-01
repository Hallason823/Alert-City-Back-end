package com.example.Alert_City.dto;

import com.example.Alert_City.enums.ProfileType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private ProfileType profileType;
    private Long institutionId;
    private String institutionName;
}
