package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank
    @Size(max = 500)
    private String description;


    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
