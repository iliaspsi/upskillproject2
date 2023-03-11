package learnacademy.mngment.services;

import learnacademy.mngment.dao.PersonRepository;
import learnacademy.mngment.entity.S_Per;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StaffService {

        @Autowired
        PersonRepository personRepository;

        public List<S_Per> listStaff(){
            return (List<S_Per>) personRepository.findAll();
        }

        public List<S_Per> listStaffByCategory(int category_id){
           return personRepository.findByCategoryCategoryid(category_id);
        }

        public void addStaff(S_Per person) {
            personRepository.save(person);
        }

        public void deleteStaffbyId(Long per_id){
            personRepository.deleteById(per_id);
        }

        public S_Per findStaff(Long id){
            return personRepository.findById(id).get();
        }
}
