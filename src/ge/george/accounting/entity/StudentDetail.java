package ge.george.accounting.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_detail")
public class StudentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "age")
    private int age;

    @Column(name = "hobby")
    private String hobby;


    @OneToOne(mappedBy = "studentDetail",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
                    CascadeType.REFRESH})
    private Student student;

    public StudentDetail(int age, String hobby) {
        this.age = age;
        this.hobby = hobby;
    }

    public StudentDetail() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "StudentDetail{" +
                "id=" + id +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", student=" + student +
                '}';
    }

    public int getStudentId() {
        return student.getId();
    }
}
