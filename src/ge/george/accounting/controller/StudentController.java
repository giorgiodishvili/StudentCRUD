package ge.george.accounting.controller;

import ge.george.accounting.entity.Student;
import ge.george.accounting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public String showAll(Model model) {
        List<Student> students = studentService.getStudents();

        model.addAttribute("students", students);

        return "list-students";

    }


    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        //create model attriute to bind form data;

        Student student = new Student();
        theModel.addAttribute("student", student);
        return "student-form";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/student/list";

    }


}
