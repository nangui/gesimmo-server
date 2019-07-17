package main.java.com.nangui.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "properties")
public class Property implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean state;
    private double amount;
    private Address address;
    private TimeStamps timeStamps;
    @ManyToOne
    private Lessor lessor;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "property",
            orphanRemoval = true
    )
    private List<Leasing> leasings;
    @ManyToOne
    private PropertyType type;

    public Property() {
    }

    public Property(boolean state, double amount, Address address, TimeStamps timeStamps) {
        this.state = state;
        this.amount = amount;
        this.address = address;
        this.timeStamps = timeStamps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

    public Lessor getLessor() {
        return lessor;
    }

    public void setLessor(Lessor lessor) {
        this.lessor = lessor;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Leasing> getLeasings() {
        return leasings;
    }

    public void setLeasings(List<Leasing> leasings) {
        this.leasings = leasings;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }
}
