package ge.george.accounting.dao;

import ge.george.accounting.entity.StudentDetail;

public interface StudentDetailDAO {


    void saveStudentDetail(StudentDetail studentDetail);

    StudentDetail getDetailByStudentId(int theId);

    StudentDetail getDetail(int id);

}
