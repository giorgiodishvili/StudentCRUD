package ge.george.accounting.controller;

import ge.george.accounting.entity.Student;
import ge.george.accounting.entity.StudentDetail;
import ge.george.accounting.service.StudentDetailService;
import ge.george.accounting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/studentDetail")
public class StudentDetailController {
    @Autowired
    private StudentDetailService studentDetailService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/detail/{id}")
    public String showDetails(@PathVariable int id,
                              Model theModel) {
        System.out.println(id);
        StudentDetail studentDetail = studentDetailService.getDetailByStudentId(id);
        theModel.addAttribute("studentID", id);
        theModel.addAttribute("detail", studentDetail);

        return "detail-list";

    }

    @PostMapping(value = "/updateStudentDetail/{studentId}")
    public String saveStudentDetail(@PathVariable int studentId, @ModelAttribute("studentDetail") StudentDetail studentDetail) {
        Student student = studentService.getStudent(studentId);
        student.setStudentDetail(studentDetail);
        studentService.saveStudent(student);
        return ("redirect:/studentDetail/detail/" + studentId);
    }


    @GetMapping(value = {"/showFormForUpdateDetail/{studentId}/", "/showFormForUpdateDetail/{studentId}/{detailId}"})
    public String showFormForUpdateDetail(@PathVariable Optional<Integer> detailId, @PathVariable int studentId, Model theModel) {
        //create model attriute to bind form data;
        if (detailId.isPresent()) {
            Integer detId = detailId.get();
            StudentDetail studentDetail = studentDetailService.getDetail(detId);
            theModel.addAttribute("studentDetail", studentDetail);
        } else {
            StudentDetail studentDetail = new StudentDetail();
            theModel.addAttribute("studentDetail", studentDetail);
        }

        return "detail-form";
    }
}
