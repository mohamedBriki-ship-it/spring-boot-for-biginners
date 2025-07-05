package com.first.SpringDemo.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")

public class StudentController {

    private StudentService service;


    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }
}
