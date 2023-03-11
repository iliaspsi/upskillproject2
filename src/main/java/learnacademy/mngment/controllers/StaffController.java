package learnacademy.mngment.controllers;

import learnacademy.mngment.entity.StudentReg;
import learnacademy.mngment.services.ClassService;
import learnacademy.mngment.services.StaffService;
import learnacademy.mngment.entity.S_Per;
import learnacademy.mngment.services.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class StaffController {

    @Autowired
    private StaffService staffservice;
    @Autowired
    private ClassService classService;
    @Autowired
    private StudentClassService studentClassService;

    @GetMapping("/listStaff")
    public String listStaff (Model theModel) {
        List < S_Per > stafflist = staffservice.listStaff();
        theModel.addAttribute("staff", stafflist);
        return "stafflist";
    }

    @PostMapping("/saveStaff")
    public String saveStaff(@ModelAttribute("person") S_Per theperson) {
        staffservice.addStaff(theperson);
        return "redirect:/listStaff";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        S_Per person = new S_Per();
        theModel.addAttribute("person", person);
        return "addForm";
    }
    @GetMapping("/edit")
    public String showFormForEdit(@RequestParam("id") Long perid,Model theModel) {
        S_Per person = staffservice.findStaff(perid);
        theModel.addAttribute("person",person);
        return "editForm";
    }
    @GetMapping("/delete")
    public String deleteStaff(@RequestParam("id") Long perid) {
        staffservice.deleteStaffbyId(perid);
        return "redirect:/listStaff";
    }

    @GetMapping("/liststudents")
    public String listStudents (Model theModel) {
        List <StudentReg> studentlist = studentClassService.findStudentbycat(2);
        theModel.addAttribute("studentlist", studentlist);
        return "liststudents";
    }

}
