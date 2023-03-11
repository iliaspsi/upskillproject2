package learnacademy.mngment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="s_subject")
@Getter
@Setter
public class S_subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subject_id")
    private Long subject_id;

    @Column(name="subject_desc")
    private String subject_desc;

    @OneToMany(mappedBy = "sbj",cascade = CascadeType.ALL)
    private Set<S_class> cls;

}
