package co.simplon.matchmydev.auth.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role extends AbstractEntity {
	
	
	@Column(name="name")
	private String name;

	public Role() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + "]";
	}
	

}
