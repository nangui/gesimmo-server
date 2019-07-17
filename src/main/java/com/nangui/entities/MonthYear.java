package main.java.com.nangui.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "month_year")
public class MonthYear implements Serializable {
    @Id
    @ManyToOne
    private Month month;
    @Id
    @ManyToOne
    private Year year;
    @OneToMany(
            mappedBy = "period",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Payment> payment;

    public MonthYear() {
    }

    public MonthYear(Month month, Year year) {
        this.month = month;
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }
}
