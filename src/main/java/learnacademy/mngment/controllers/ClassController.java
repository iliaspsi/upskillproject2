package learnacademy.mngment.controllers;

import learnacademy.mngment.dao.PersonRepository;
import learnacademy.mngment.entity.S_Per;
import learnacademy.mngment.entity.S_class;
import learnacademy.mngment.entity.S_subject;
import learnacademy.mngment.services.ClassService;
import learnacademy.mngment.services.StaffService;
import learnacademy.mngment.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class ClassController {


    @Autowired
    private ClassService classservice;
    @Autowired
    private StaffService staffservice;
    @Autowired
    private SubjectService subjectservice;

    @GetMapping("/listclasses")
    public String listClasses (Model theModel) {
        List<S_class> classlist = classservice.listClasses();
        theModel.addAttribute("classes", classlist);
        return "listclasses";
    }

    @PostMapping("/saveclass")
    public String saveClass(@ModelAttribute("cls") S_class theclass) {
        classservice.addClass(theclass);
        return "redirect:/listclasses";
    }

    @GetMapping("/showclassForm")
    public String showFormForAdd(Model theModel) {
        S_class theclass = new S_class();
        theModel.addAttribute("cls", theclass);
        return "addclassform";
    }
    @GetMapping("/editclass")
    public String showFormForEdit(@RequestParam("id") Long classid, Model theModel) {
        S_class theclass = classservice.findClass(classid);
        theModel.addAttribute("cls",theclass);
        return "editclassform";
    }
    @GetMapping("/deleteclass")
    public String deleteClass(@RequestParam("id") Long classid) {
        classservice.deleteClassbyId(classid);
        return "redirect:/listclasses";
    }
    @GetMapping("/assignclass")
    public String showFormForAssign(@RequestParam("id") Long classid, Model theModel) {
        S_class theclass = classservice.findClass(classid);
        theModel.addAttribute("cls", theclass);
        List<S_Per> stafflist = staffservice.listStaffByCategory(1);
        theModel.addAttribute("staff1", stafflist);
        return "assignclass";
    }
    @GetMapping("/assignclasstosubject")
    public String showFormForAssignSubj(@RequestParam("id") Long classid,@RequestParam(value = "per_id",required = true,defaultValue = "0") int per_id, Model theModel) {

        if (per_id != 0) {
            List<S_subject> subjects = subjectservice.listSubjects();
            theModel.addAttribute("subjects", subjects);
            S_class cls = classservice.findClass(classid);
            theModel.addAttribute("cls", cls);
            S_Per prs = staffservice.findStaff((long) per_id);
            theModel.addAttribute("prs", prs);
            staffservice.addStaff(prs);
        }
        if (per_id == 0) {
            List<S_subject> subjects = subjectservice.listSubjects();
            theModel.addAttribute("subjects", subjects);
            S_class cls = classservice.findClass(classid);
            theModel.addAttribute("cls", cls);
        }
        return "assignclasstosubject";
    }
}
