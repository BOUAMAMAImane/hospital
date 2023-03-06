package com.example.hospital.repositories;

import com.example.hospital.entities.Patient;
import com.example.hospital.entities.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepository extends JpaRepository<Rendezvous,Long> {

}
