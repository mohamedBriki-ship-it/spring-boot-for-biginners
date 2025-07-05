package com.first.SpringDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service

public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "mohamed",
                        "briki",
                        LocalDate.now(),
                        "contact@gmail.com",
                        20
                ),
                new Student(
                        "farid",
                        "briki",
                        LocalDate.now(),
                        "najeh@gmail.com",
                        23
                )
        );
    }
}
