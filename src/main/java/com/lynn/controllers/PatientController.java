package com.lynn.controllers;

import com.lynn.requests.PatientInfo;
import com.lynn.responses.PatientResponse;
import com.lynn.services.PatientService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @PostMapping( "patient/create")
    public PatientResponse createPatient(@RequestBody PatientInfo details){

        return patientService.createPatient(details);
    }

   @GetMapping("/patient/get")
    public String getPatientDetails(@RequestParam(name = "name", defaultValue = "Patient B") String name, @RequestParam int age, @RequestParam String phoneNumber){
        return patientService.getPatient(name, age, phoneNumber);
    }


}
