package com.gabrpavel.studentapplication.repository;

import com.gabrpavel.studentapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteStudentByEmail(String email);
    Student findStudentByEmail(String email);
}
