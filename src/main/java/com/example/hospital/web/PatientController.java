package com.example.hospital.web;

import com.example.hospital.entities.Patient;
import com.example.hospital.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
     private PatientRepository patientRepository;
     @GetMapping(path = "/patients")
     public String patients(Model model,
                            @RequestParam(name = "page",defaultValue = "0") int page,
                            @RequestParam(name = "size",defaultValue = "6") int size,
                            @RequestParam(name = "keyword",defaultValue = "") String keyword){
         Page<Patient> Pagepatient=patientRepository.findByNomContains(keyword,PageRequest.of(page, size));
         model.addAttribute("listp",Pagepatient.getContent());
         model.addAttribute("pages",new int[Pagepatient.getTotalPages()]);
         model.addAttribute("currentpage",page);
         model.addAttribute("keyword",keyword);
         return "patients";
     }
    @GetMapping(path = "/delete")
    public String delete(long id,int page,String keyword){
        patientRepository.deleteById(id);
        return "redirect:/patients?page="+page+"&keyword"+keyword;
    }
    @GetMapping(path = "/")
     public String home(){
         return "redirect:/patients";
     }
    @GetMapping(path = "/form")
    public String formpatients(Model model){
         model.addAttribute("patient",new Patient());
        return "formpatients";
    }
    @PostMapping(path = "/save")
    public String save(Model model,Patient patient){
        patientRepository.save(patient);
         return "formpatients";
     }
    @GetMapping(path = "/editPatient")
    public String editPatient(Model model,long id){
         Patient patient=patientRepository.findPatientById(id);
         if (patient==null) throw new RuntimeException("Patient introuvable");
         model.addAttribute("patient",new Patient());
        return "editpatients";
    }

}
