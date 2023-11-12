package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills =new ArrayList<Skill>();

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> skills) {
        super();
        this.employer = anEmployer;
        this.skills = skills;
    }

    // Getters and setters.

    public Employer getEmployer() {

        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}