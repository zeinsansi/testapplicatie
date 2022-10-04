package com.testapplicatie.testapplicatie.controller;

import com.testapplicatie.testapplicatie.model.Student;
import com.testapplicatie.testapplicatie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Nieuwe leerling is toegevoegd";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }
}
