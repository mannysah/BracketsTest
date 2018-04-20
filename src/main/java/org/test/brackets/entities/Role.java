package org.test.brackets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public class Role {

	@Id
	@Column(name="ROLE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="ROLE_DESCRIPTION")
	String roleDescription;
	
	@Column(name="ROLE_COMMENTS")
	String roleComments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getRoleComments() {
		return roleComments;
	}

	public void setRoleComments(String roleComments) {
		this.roleComments = roleComments;
	}
}
