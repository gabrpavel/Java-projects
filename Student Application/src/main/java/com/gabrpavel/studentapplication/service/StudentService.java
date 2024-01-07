package com.gabrpavel.studentapplication.service;

import com.gabrpavel.studentapplication.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);
    Student getStudentByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
