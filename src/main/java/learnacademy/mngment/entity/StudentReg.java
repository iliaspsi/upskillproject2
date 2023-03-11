package learnacademy.mngment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="t_class")
@Getter
@Setter
public class StudentReg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @OneToOne
    @JoinColumn(name="perid")
    private S_Per person;

    @OneToOne
    @JoinColumn(name="classid")
    private S_class cls;
}
