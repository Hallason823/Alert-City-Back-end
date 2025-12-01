package com.example.Alert_City.dto;

import com.example.Alert_City.enums.Priority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private Long id;
    private String name;
    private Integer slaHours;
    private Priority defaultPriority;
}
