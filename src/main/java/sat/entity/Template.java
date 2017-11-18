package sat.entity;

import javax.persistence.Column;

public class Template extends AbstractEntity {

	@Column(name = "name")
	private String name;

	public Template() {
	}

	public Template(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
