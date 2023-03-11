package learnacademy.mngment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="s_category")
@Getter
@Setter
public class S_category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private int categoryid;

    @Column(name="category_desc")
    private String categoryname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<S_Per> persons;
}
