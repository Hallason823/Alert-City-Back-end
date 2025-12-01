package com.example.Alert_City.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InstitutionDTO {
    private Long id;
    private String name;
    private String description;
    private String logoUrl;
    private String officialContact;
}
