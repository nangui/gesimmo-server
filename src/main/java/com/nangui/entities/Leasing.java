package main.java.com.nangui.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "leasing")
public class Leasing implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Property property;
    @OneToMany(
            mappedBy = "leasing",
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    private List<Payment> payments;
    private TimeStamps timeStamps;

    public Leasing() {
    }

    public Leasing(double amount, Customer customer, Property property, TimeStamps timeStamps) {
        this.amount = amount;
        this.customer = customer;
        this.property = property;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
