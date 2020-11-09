package ge.george.accounting.service;

import ge.george.accounting.entity.StudentDetail;

public interface StudentDetailService {
    void saveStudentDetail(StudentDetail studentDetail);

    StudentDetail getDetailByStudentId(int theId);

    StudentDetail getDetail(int theId);


}
