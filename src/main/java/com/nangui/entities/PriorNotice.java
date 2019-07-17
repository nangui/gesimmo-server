package main.java.com.nangui.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "prior_notices")
public class PriorNotice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private TimeStamps timeStamps;

    public PriorNotice() {
    }

    public PriorNotice(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }
}
