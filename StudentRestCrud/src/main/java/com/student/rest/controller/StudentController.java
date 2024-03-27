package com.student.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.student.rest.entity.Student;
import com.student.rest.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private  StudentService studentService;


// getting all students from db
    @GetMapping("/getall")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

//    getting particular object by its id
    @GetMapping("get/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

//    adding student object to db
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

//    updating student object
    @PutMapping("update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    
//    deleting the student obj by id
    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Student with ID " + id + " has been deleted successfully.";
    }
}
