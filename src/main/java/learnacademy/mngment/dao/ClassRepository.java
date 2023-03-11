package learnacademy.mngment.dao;

import learnacademy.mngment.entity.S_class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<S_class,Long> {
}
