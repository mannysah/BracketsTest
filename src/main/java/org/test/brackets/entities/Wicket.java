package org.test.brackets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WICKET")
public class Wicket {

	@Id
	@Column(name="WICKET_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="WICKET_DESCRIPTION")
	String wicketDescription;
	
	@Column(name="WICKET_COMMENTS")
	String wicketComments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWicketDescription() {
		return wicketDescription;
	}

	public void setWicketDescription(String wicketDescription) {
		this.wicketDescription = wicketDescription;
	}

	public String getWicketComments() {
		return wicketComments;
	}

	public void setWicketComments(String wicketComments) {
		this.wicketComments = wicketComments;
	}
}
