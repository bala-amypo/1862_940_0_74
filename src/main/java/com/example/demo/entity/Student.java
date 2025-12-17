//studentDetail.java
package com.example.demo.model;

import java.time.LocalDate;

public class StudentDetail {
    @id
    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    
    
    
    public StudentDetail(long id, String name, String email, LocalDate dob, float cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public StudentDetail() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;   
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;   
    }
    public void setEmail(String email) {
        this.email = email;
    }

}