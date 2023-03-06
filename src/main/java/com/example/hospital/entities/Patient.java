package com.example.hospital.entities;

import jakarta.persistence.*;
import jakarta.validation.MessageInterpolator;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;
    @NotEmpty
    @Size(min=3)
    @NotNull
    private String nom;
    @DecimalMin("20")
    private int score;
    private boolean malade;
    @OneToMany(mappedBy = "patient")
    private Collection<Rendezvous> rendezvous;


}
