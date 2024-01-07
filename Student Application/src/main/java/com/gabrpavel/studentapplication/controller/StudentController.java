package com.gabrpavel.studentapplication.controller;

import com.gabrpavel.studentapplication.model.Student;
import com.gabrpavel.studentapplication.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        // todo
        return studentService.getAllStudents();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Student saved";
    }

    @GetMapping("/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return studentService.getStudentByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email) {
        studentService.deleteStudent(email);
    }
}
