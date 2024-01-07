package com.gabrpavel.studentapplication.service.Impl;

import com.gabrpavel.studentapplication.model.Student;
import com.gabrpavel.studentapplication.repository.InMemoryStudentDAO;
import com.gabrpavel.studentapplication.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return repository.getStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
