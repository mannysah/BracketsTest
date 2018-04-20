package org.test.brackets.model;

public class Team {
	private long teamId;
    private String teamName;

    public Team(long teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
    }
    
    public long getTeamId() {
		return teamId;
	}
	public String getTeamName() {
		return teamName;
	}
}
