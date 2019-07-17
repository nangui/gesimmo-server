package main.java.com.nangui.entities;

import org.hibernate.type.TextType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "lessors_type")
public class LessorType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Nomination nomination;
    private TextType description;
    private TimeStamps timeStamps;
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "type",
            orphanRemoval = true
    )
    private List<Lessor> lessors;

    public LessorType() {
    }

    public LessorType(Nomination nomination, TextType description, TimeStamps timeStamps) {
        this.nomination = nomination;
        this.description = description;
        this.timeStamps = timeStamps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Nomination getNomination() {
        return nomination;
    }

    public void setNomination(Nomination nomination) {
        this.nomination = nomination;
    }

    public TextType getDescription() {
        return description;
    }

    public void setDescription(TextType description) {
        this.description = description;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

    public List<Lessor> getLessors() {
        return lessors;
    }

    public void setLessors(List<Lessor> lessors) {
        this.lessors = lessors;
    }
}
