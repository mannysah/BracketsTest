package org.test.brackets.model;

public class Player {
	private long playerId;
    private String playerComments;

    public Player(long playerId, String playerComments) {
        this.playerId = playerId;
        this.playerComments = playerComments;
    }
    
    public long getPlayerId() {
		return playerId;
	}
	public String getplayerComments() {
		return playerComments;
	}
}

