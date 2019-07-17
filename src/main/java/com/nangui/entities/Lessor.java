package main.java.com.nangui.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "lessors")
public class Lessor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(
            mappedBy = "lessor",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Property> properties;
    @ManyToOne
    private LessorType type;

    public Lessor() {
    }

    public Lessor(List<Property> properties, LessorType type) {
        this.properties = properties;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public LessorType getType() {
        return type;
    }

    public void setType(LessorType type) {
        this.type = type;
    }
}
