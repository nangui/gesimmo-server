package main.java.com.nangui.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "PAYMENT")
@Table(name = "payments")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    @ManyToOne
    private MonthYear period;
    @ManyToOne
    private Leasing leasing;
    private TimeStamps timeStamps;

    public Payment() {
    }

    public Payment(double amount, MonthYear period, TimeStamps timeStamps) {
        this.amount = amount;
        this.period = period;
        this.timeStamps = timeStamps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public MonthYear getPeriod() {
        return period;
    }

    public void setPeriod(MonthYear period) {
        this.period = period;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

    public Leasing getLeasing() {
        return leasing;
    }

    public void setLeasing(Leasing leasing) {
        this.leasing = leasing;
    }
}
