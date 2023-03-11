package learnacademy.mngment.dao;

import learnacademy.mngment.entity.S_Per;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface PersonRepository extends JpaRepository<S_Per,Long>{
    List<S_Per> findByCategoryCategoryid(int categoryid);
}
