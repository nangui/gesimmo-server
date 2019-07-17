package main.java.com.nangui.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "years")
public class Year implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private LongType id;
    private StringType displayName;
    private StringType title;
    @OneToMany(
            mappedBy = "year",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<MonthYear> months;

    public Year() {
    }

    public Year(StringType displayName, StringType title) {
        this.displayName = displayName;
        this.title = title;
    }

    public LongType getId() {
        return id;
    }

    public void setId(LongType id) {
        this.id = id;
    }

    public StringType getDisplayName() {
        return displayName;
    }

    public void setDisplayName(StringType displayName) {
        this.displayName = displayName;
    }

    public StringType getTitle() {
        return title;
    }

    public void setTitle(StringType title) {
        this.title = title;
    }

    public List<MonthYear> getMonths() {
        return months;
    }

    public void setMonths(List<MonthYear> months) {
        this.months = months;
    }
}
