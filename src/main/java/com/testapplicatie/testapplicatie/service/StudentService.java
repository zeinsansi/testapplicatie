package com.testapplicatie.testapplicatie.service;

import com.testapplicatie.testapplicatie.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
