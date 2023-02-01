package com.lynn.services;

import com.lynn.entities.Student;
import com.lynn.repositories.StudentRepository;
import com.lynn.requests.StudentInfo;
import com.lynn.responses.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;
    public String getName(String name) {
        if(name == null || name.isEmpty()) {
            return "Name is null or empty";
        }
        return String.format("My name is %s", name);
    }

    public StudentInfo getById(int studentId) {
        Optional<Student> studentOptional = repository.findById(studentId);
        if (studentOptional.isEmpty()) {
            return null;
        }
        Student student = studentOptional.get();

        return StudentInfo.builder()
                .id(student.getId())
                .streamName(student.getStreamName())
                .name(student.getName())
                .admissionNo(student.getAdmissionNo())
                .build();
    }

    public StudentResponse create(StudentInfo info) {
        System.out.printf("Received Request with Admission No: %s, Name: %s and Stream: %s%n",
                info.admissionNo, info.name, info.streamName);

        Student student = Student
                .builder()
                .name(info.name)
                .streamName(info.streamName)
                .admissionNo(info.admissionNo)
                .build();

        repository.saveAndFlush(student);

        return StudentResponse
                .builder()
                .message("Student created successfully")
                .status(true)
                .id(student.getId())
                .build();
    }
}
