package com.example.hospital.service;

import com.example.hospital.entities.Consultation;
import com.example.hospital.entities.Medcin;
import com.example.hospital.entities.Patient;
import com.example.hospital.entities.Rendezvous;

public interface IHospitalService {

    Patient savePatient(Patient patient);
    Medcin savMedcin(Medcin medcin);
    Rendezvous saveRdv(Rendezvous rendezvous);
    Consultation saveConsultation(Consultation consultation);


}
