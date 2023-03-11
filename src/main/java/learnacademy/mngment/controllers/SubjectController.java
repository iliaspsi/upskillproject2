package learnacademy.mngment.controllers;

import learnacademy.mngment.entity.S_Per;
import learnacademy.mngment.entity.S_class;
import learnacademy.mngment.entity.S_subject;
import learnacademy.mngment.services.ClassService;
import learnacademy.mngment.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class SubjectController {

    @Autowired
    private SubjectService subjectservice;
    @Autowired
    private ClassService classService;

    @GetMapping("/listsubjects")
    public String listClasses (Model theModel) {
        List<S_subject> subjectlist = subjectservice.listSubjects();
        theModel.addAttribute("subjects", subjectlist);
        return "listsubjects";
    }

    @PostMapping("/savesubject")
    public String saveSubject(@ModelAttribute("subject") S_subject thesubject) {
        subjectservice.addClass(thesubject);
        return "redirect:/listsubjects";
    }

    @GetMapping("/showsubjectForm")
    public String showFormForAdd(Model theModel) {
        S_subject thesubject = new S_subject();
        theModel.addAttribute("subject", thesubject);
        return "addsubjectform";
    }
    @GetMapping("/editsubject")
    public String showFormForEdit(@RequestParam("id") Long subjectid, Model theModel) {
        S_subject thesubject = subjectservice.findSubject(subjectid);
        theModel.addAttribute("subject",thesubject);
        return "editsubjectform";
    }
    @GetMapping("/deletesubject")
    public String deleteSubject(@RequestParam("id") Long subjectid) {
        subjectservice.deleteSubjectById(subjectid);
        return "redirect:/listsubjects";
    }
    @GetMapping("/showclasstosubject")
    public String showFormForAssignSubj(@RequestParam("id") Long subject_id, Model theModel) {
        S_subject subject = subjectservice.findSubject(subject_id);
        theModel.addAttribute("subject", subject);
        return "showclasstosubject";
    }
}
