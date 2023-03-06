package com.example.hospital.repositories;

import com.example.hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.regex.PatternSyntaxException;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
    Patient findPatientById(long id);
    Page<Patient> findByNomContains(String keyword, Pageable pageable);

}
