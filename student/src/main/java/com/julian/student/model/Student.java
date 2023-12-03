package com.julian.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;
    private String lastname;
    private String email;


    private Long schoolId;
}
