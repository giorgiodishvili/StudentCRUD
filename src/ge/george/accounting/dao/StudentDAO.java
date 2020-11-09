package ge.george.accounting.dao;

import ge.george.accounting.entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> getStudents();


    void saveStudent(Student student);

    Student getStudent(int id);
}
