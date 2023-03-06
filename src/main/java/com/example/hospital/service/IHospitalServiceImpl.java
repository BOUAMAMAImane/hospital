package com.example.hospital.service;

import com.example.hospital.entities.Consultation;
import com.example.hospital.entities.Medcin;
import com.example.hospital.entities.Patient;
import com.example.hospital.entities.Rendezvous;
import com.example.hospital.repositories.ConsultationRepository;
import com.example.hospital.repositories.MedcinRepository;
import com.example.hospital.repositories.PatientRepository;
import com.example.hospital.repositories.RendezvousRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IHospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedcinRepository medcinRepository;
    private ConsultationRepository consultationRepository;
    private RendezvousRepository rendezvousRepository;

    public IHospitalServiceImpl(PatientRepository patientRepository, MedcinRepository medcinRepository, ConsultationRepository consultationRepository, RendezvousRepository rendezvousRepository) {
        this.patientRepository = patientRepository;
        this.medcinRepository = medcinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezvousRepository = rendezvousRepository;
    }
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medcin savMedcin(Medcin medcin) {

        return medcinRepository.save(medcin);
    }

    @Override
    public Rendezvous saveRdv(Rendezvous rendezvous) {

        return rendezvousRepository.save(rendezvous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}
