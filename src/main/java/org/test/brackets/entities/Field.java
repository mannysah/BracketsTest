package org.test.brackets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROUND")
public class Field {

	@Id
	@Column(name="GROUND_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="GROUND_NAME")
	String groundName;
	
	@Column(name="GROUND_COMMENTS")
	String groundComments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public String getGroundComments() {
		return groundComments;
	}

	public void setGroundComments(String groundComments) {
		this.groundComments = groundComments;
	}
}