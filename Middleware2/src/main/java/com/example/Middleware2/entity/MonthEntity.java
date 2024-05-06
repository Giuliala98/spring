package com.example.Middleware2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthEntity {

    private Integer monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;
}
