package com.example.hospital;

import com.example.hospital.entities.*;
import com.example.hospital.repositories.ConsultationRepository;
import com.example.hospital.repositories.MedcinRepository;
import com.example.hospital.repositories.PatientRepository;
import com.example.hospital.repositories.RendezvousRepository;
import com.example.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

    //le code q un va mettre a linterieur va etre excecute e premier
    //@Bean
    /*CommandLineRunner start(IHospitalService iHospitalService,
                            MedcinRepository medcinRepository,
                            PatientRepository patientRepository
    ) {
        return args -> {

            Stream.of("Yassine", "Kamal", "Nada")
                    .forEach(name -> {
                        Medcin medcin = new Medcin();
                        medcin.setNom(name);
                        medcin.setSpecialte(Math.random() > 0.5 ? "Cardio" : "Pediatre");
                        medcin.setEmail(name + "@gmail.com");
                        iHospitalService.savMedcin(medcin);
                    });
            Stream.of("soso", "laila", "Nilya")
                    .forEach(name -> {
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setScore(100);
                        patient.setMalade(true);
                        iHospitalService.savePatient(patient);
                    });
            Patient patient2 = patientRepository.findByNom("laila");
            Patient patient = patientRepository.findById(1L);
            Medcin medcin1 = medcinRepository.findByNom("Nada");

            Rendezvous rdv = new Rendezvous();
            rdv.setDate(new Date());
            rdv.setStatus(StatusRDV.PENDING);
            rdv.setPatient(patient);
            rdv.setMedcin(medcin1);
            iHospitalService.saveRdv(rdv);

            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRapport("Rapport du consulta....");
            consultation.setRendezvous(rdv);
            iHospitalService.saveConsultation(consultation);
        };

    }
}

*/