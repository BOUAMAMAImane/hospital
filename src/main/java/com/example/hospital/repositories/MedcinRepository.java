package com.example.hospital.repositories;

import com.example.hospital.entities.Medcin;
import com.example.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository<Medcin,Long> {
    Medcin findByNom(String name);
}
