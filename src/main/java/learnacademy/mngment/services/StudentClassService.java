package learnacademy.mngment.services;

import learnacademy.mngment.dao.StudentClassRepository;
import learnacademy.mngment.entity.StudentReg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Controller
@Transactional
public class StudentClassService {

    @Autowired
    StudentClassRepository studentClassRepository;

    public List<StudentReg> listkeys() {
        return (List<StudentReg>) studentClassRepository.findAll();
    }

    public List<StudentReg> findStudentbycat(int catid) {
        return studentClassRepository.findByPersonCategoryCategoryid(catid);
    }

}
