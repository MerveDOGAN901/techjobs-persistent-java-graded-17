package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;


@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min = 3, max = 50)
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(String location) {
        this.location = location;
    }

    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employer employer = (Employer) o;
        return Objects.equals(location, employer.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "location='" + location + '\'' +
                '}';
    }
}
