package ge.george.accounting.service;

import ge.george.accounting.dao.StudentDetailDAO;
import ge.george.accounting.entity.StudentDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StudentDetailServiceImpl implements StudentDetailService {
    @Autowired
    private StudentDetailDAO studentDetailDAO;


    @Override
    @Transactional
    public void saveStudentDetail(StudentDetail studentDetail) {
        studentDetailDAO.saveStudentDetail(studentDetail);
    }

    @Override
    @Transactional
    public StudentDetail getDetailByStudentId(int theId) {
        return studentDetailDAO.getDetailByStudentId(theId);
    }

    @Override
    @Transactional
    public StudentDetail getDetail(int theId) {
        return studentDetailDAO.getDetail(theId);
    }
}
