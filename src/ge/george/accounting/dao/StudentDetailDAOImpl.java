package ge.george.accounting.dao;

import ge.george.accounting.entity.Student;
import ge.george.accounting.entity.StudentDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDetailDAOImpl implements StudentDetailDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private StudentDAO studentDAO;


    @Override
    public void saveStudentDetail(StudentDetail studentDetail) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(studentDetail);
    }

    @Override
    public StudentDetail getDetailByStudentId(int id) {
        Session session = sessionFactory.getCurrentSession();

        Student student = studentDAO.getStudent(id);
        return student.getStudentDetail();
    }

    @Override
    public StudentDetail getDetail(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(StudentDetail.class, id);

    }

}
