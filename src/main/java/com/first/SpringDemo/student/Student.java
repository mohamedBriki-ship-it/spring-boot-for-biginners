package com.first.SpringDemo.student;

import java.time.LocalDate;

public class Student {
    private String firstname;

    private String lastnaame;

    private LocalDate date0fBirth;

    private String email;

    private  int age;

    public Student(String firstname, String lastnaame, LocalDate date0fBirth, String email, int age) {
        this.firstname = firstname;
        this.lastnaame = lastnaame;
        this.date0fBirth = date0fBirth;
        this.email = email;
        this.age = age;
    }

    public Student() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastnaame() {
        return lastnaame;
    }

    public void setLastnaame(String lastnaame) {
        this.lastnaame = lastnaame;
    }

    public LocalDate getDate0fBirth() {
        return date0fBirth;
    }

    public void setDate0fBirth(LocalDate date0fBirth) {
        this.date0fBirth = date0fBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}