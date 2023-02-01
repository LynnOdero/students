package com.lynn.services;

import com.lynn.requests.PatientInfo;
import com.lynn.responses.PatientResponse;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    public String getPatient(String name, int age, String phoneNumber){
        if (name == null || name.isEmpty()){
            return "Patient not available";
        }
        if (age < 1){
            return "Record is invalid";
        }

        return String.format("Name: %s Age: %d Phone Number: %s", name, age, phoneNumber);
    }
    public PatientResponse createPatient(PatientInfo info){
        System.out.printf("Received Request for patient details %s,name: %s, age: %s, phoneNumber", info.patientName,
                info.age, info.patientPhone);
        PatientResponse patientResponse = new PatientResponse();
        patientResponse.message = "Patient successfully created";
        patientResponse.status = true;

        return patientResponse;

    }

}
