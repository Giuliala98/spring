package com.example.es_hibernate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "studenti")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Students {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String firstName;
    @Column (unique = true, nullable = false)
    private String email;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
    private List<Enrollments> enrollmentsList;

}
