package no.ber.sofachamps.entity.model;

import javax.persistence.Entity;

import no.ber.sofachamps.entity.BaseEntity;

@Entity
public class Team extends BaseEntity {

    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
