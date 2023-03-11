package learnacademy.mngment.dao;

import learnacademy.mngment.entity.S_subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<S_subject, Long> {
}
