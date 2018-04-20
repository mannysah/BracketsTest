package org.test.brackets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYER")
public class Player {

	@Id
	@Column(name="PLAYER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="PLAYER_FIRST_NAME")
	String playerFirstName;
	
	@Column(name="PLAYER_LAST_NAME")
	String playerLastName;

	@Column(name="PLAYER_EMAIL")
	String playerEmail;
	
	@Column(name="PLAYER_PHNBR")
	String playerPhnbr;
	
	@Column(name="PLAYER_TEAM_ID")
	String playerTeamId;
	
	@Column(name="PLAYER_ROLE_ID")
	String playerRoleId;
	
	@Column(name="PLAYER_COMMENTS")
	String playerComments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	
	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public String getPlayerEmail() {
		return playerEmail;
	}

	public void setPlayerEmail(String playerEmail) {
		this.playerEmail = playerEmail;
	}

	public String getPlayerPhnbr() {
		return playerPhnbr;
	}

	public void setPlayerPhnbr(String playerPhnbr) {
		this.playerPhnbr = playerPhnbr;
	}

	public String getPlayerTeamId() {
		return playerTeamId;
	}

	public void setPlayerTeamId(String playerTeamId) {
		this.playerTeamId = playerTeamId;
	}

	public String getPlayerRoleId() {
		return playerRoleId;
	}

	public void setPlayerRoleId(String playerRoleId) {
		this.playerRoleId = playerRoleId;
	}

	public String getPlayerComments() {
		return playerComments;
	}

	public void setPlayerComments(String playerComments) {
		this.playerComments = playerComments;
	}
}
