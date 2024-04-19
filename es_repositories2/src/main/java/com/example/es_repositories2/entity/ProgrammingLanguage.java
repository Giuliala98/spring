package com.example.es_repositories2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "firstAppearance")
    private String firstAppearance;

    @Column(name = "inventor", nullable = false)
    private String inventor;
}
