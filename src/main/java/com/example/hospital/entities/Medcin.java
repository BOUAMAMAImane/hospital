package com.example.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Collection;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medcin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String nom;
    private String email;
    private  String specialte;
    @OneToMany(mappedBy = "medcin" ,fetch = FetchType.LAZY)
    private Collection<Rendezvous> rendezvous;
}
