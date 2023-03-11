package learnacademy.mngment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="s_class")
@Getter
@Setter
public class S_class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="class_id")
    private Long class_id;

    @Column(name="class_desc")
    private String class_desc;


    @ManyToOne
    @JoinColumn(name = "per_id")
    private S_Per person;


    @ManyToOne
    @JoinColumn(name="subject_id")
    private S_subject sbj;



}
