package org.test.brackets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEAM")

public class Team {
	
	@Id
	@Column(name="TEAM_ID")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="TEAM_NAME")
	String teamName;

	@Column(name="TEAM_REGISTERED")
	String teamRegistered;
	
	@Column(name="TEAM_PAID")
	String teamPaid;
	
	@Column(name="TEAM_WAIVER")
	String teamWaiver;
	
	@Column(name="TEAM_COMMENTS")
	String teamComments;
	
	@Column(name="TEAM_GROUP_ID")
	String teamGroupId;
	
	@Column(name="TEAM_CODE")
	String teamCode;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamRegistered() {
		return teamRegistered;
	}

	public void setTeamRegistered(String teamRegistered) {
		this.teamRegistered = teamRegistered;
	}

	public String getTeamWaiver() {
		return teamWaiver;
	}

	public void setTeamWaiver(String teamWaiver) {
		this.teamWaiver = teamWaiver;
	}

	public String getTeamPaid() {
		return teamPaid;
	}

	public void setTeamPaid(String teamPaid) {
		this.teamPaid = teamPaid;
	}

	public String getTeamComments() {
		return teamComments;
	}

	public void setTeamComments(String teamComments) {
		this.teamComments = teamComments;
	}
	
	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getTeamGroupId() {
		return teamGroupId;
	}

	public void setTeamGroupId(String teamGroupId) {
		this.teamGroupId = teamGroupId;
	}

}
