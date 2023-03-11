package learnacademy.mngment.services;

import learnacademy.mngment.dao.SubjectRepository;
import learnacademy.mngment.entity.S_subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Controller
@Transactional
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public List<S_subject> listSubjects() {
        return (List<S_subject>) subjectRepository.findAll();
    }

    public void addClass(S_subject thesubject) {
        subjectRepository.save(thesubject);
    }

    public void deleteSubjectById(Long subject_id) {
        subjectRepository.deleteById(subject_id);
    }

    public S_subject findSubject(Long id) {
        return subjectRepository.findById(id).get();

    }
}
