package com.gabrpavel.studentapplication.service.Impl;

import com.gabrpavel.studentapplication.model.Student;
import com.gabrpavel.studentapplication.repository.StudentRepository;
import com.gabrpavel.studentapplication.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteStudentByEmail(email);
    }
}
