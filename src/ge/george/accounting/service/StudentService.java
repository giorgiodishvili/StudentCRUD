package ge.george.accounting.service;

import ge.george.accounting.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();

    Student getStudent(int id);

    void saveStudent(Student student);

}
