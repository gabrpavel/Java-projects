package com.gabrpavel.studentapplication.repository;

import com.gabrpavel.studentapplication.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> getAllStudents() {
        return STUDENTS;
    }
    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student getStudentByEmail(String email) {
        return STUDENTS.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student with email " + email + " does not exist"));
    }

    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(i -> student.getEmail().equals(STUDENTS.get(i).getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1) {
            STUDENTS.set(studentIndex, student);
            return student;
        }
        return null;
    }
    public void deleteStudent(String email) {
        var student = getStudentByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }
}
