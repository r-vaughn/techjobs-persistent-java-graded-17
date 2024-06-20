package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required.")
    @Size(max = 250, message = "Description must be less than 250 characters.")
    public String description;

    @ManyToMany(mappedBy = "skills")
    public List<Job> jobs = new ArrayList<>();

    public Skill(String description, List<Job> jobs) {
        super();
        this.description = description;
        this.jobs = jobs;
    }

    public Skill() {

    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
