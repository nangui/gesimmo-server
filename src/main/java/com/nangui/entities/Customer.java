package main.java.com.nangui.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String city;
    private String district;
    private TimeStamps timeStamps;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Leasing> leasings;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private PriorNotice notice;

    private Customer() {
    }

    public Customer(long id, String firstName, String lastName, String email, String city, String district) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.district = district;
    }

    public long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<Leasing> getLeasings() {
        return leasings;
    }

    public void setLeasings(List<Leasing> properties) {
        this.leasings = leasings;
    }

    public PriorNotice getNotice() {
        return notice;
    }

    public void setNotice(PriorNotice notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + " First: " + firstName
                + " Last: " + lastName + "\n"
                + "EMail: " + email + "\n"
                + "City: " + city
                + " District: " + district;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }
}
