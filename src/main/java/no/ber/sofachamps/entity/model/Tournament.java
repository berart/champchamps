package no.ber.sofachamps.entity.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import no.ber.sofachamps.entity.BaseEntity;

@Entity
public class Tournament extends BaseEntity {

    private String name;
    @ManyToMany
    private List<Stage> stages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }
}
