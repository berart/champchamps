package no.ber.champchamps.entity;

import javax.persistence.Entity;

import no.ber.champchamps.constants.Group;

@Entity
public class Team extends BaseEntity {

	private String name;
	private String code;
	private Group group;

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

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
}
