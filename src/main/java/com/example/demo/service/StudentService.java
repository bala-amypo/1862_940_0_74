package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();           // Add this
    Optional<Student> getStudentById(Long id); // Add this (safer with Optional)
    void deleteStudent(Long id);              // Add this
}