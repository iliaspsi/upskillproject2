package learnacademy.mngment.dao;

import learnacademy.mngment.entity.StudentReg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentClassRepository extends JpaRepository<StudentReg, Long> {
    List<StudentReg> findByPersonCategoryCategoryid(int categoryid);
}
