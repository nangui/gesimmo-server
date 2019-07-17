package main.java.com.nangui.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Nomination implements Serializable {
    private String name;
    private String displayName;

    public Nomination() {
    }

    public Nomination(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
