package learnacademy.mngment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="s_per")
@Getter
@Setter
public class S_Per {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="per_id")
    private Long perid;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name="category_id")
    private S_category category;

    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private Set<S_class> classes;






}
