package com.lynn.controllers;

import com.lynn.requests.StudentInfo;
import com.lynn.responses.StudentResponse;
import com.lynn.services.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentsController {

    private final StudentService studentService;

    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/get")
    public StudentInfo get(@RequestParam(name = "id") int id){
        return studentService.getById(id);
    }

    @PostMapping("student/create")
    public StudentResponse create(@RequestBody StudentInfo info) {
      return studentService.create(info);
    }

}
