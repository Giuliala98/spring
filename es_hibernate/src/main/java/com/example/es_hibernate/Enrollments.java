package com.example.es_hibernate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "iscrizioni")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long classId;
    private Long studentId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Students students;

    @ManyToMany
    private List<Classes> classes;
}
