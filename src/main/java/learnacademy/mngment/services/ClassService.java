package learnacademy.mngment.services;

import learnacademy.mngment.dao.ClassRepository;
import learnacademy.mngment.entity.S_class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Controller
@Transactional
public class ClassService {

    @Autowired
    ClassRepository classRepository;

    public List<S_class> listClasses() {
        return (List<S_class>) classRepository.findAll();
    }

    public void addClass(S_class theclass) {
        classRepository.save(theclass);
    }

    public void deleteClassbyId(Long class_id) {
        classRepository.deleteById(class_id);
    }

    public S_class findClass(Long id) {
        return classRepository.findById(id).get();

    }
}