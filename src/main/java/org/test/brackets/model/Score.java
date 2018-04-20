package org.test.brackets.model;

public class Score {
	private long scoreId;
    private String scoreBattingOut;

    public Score(long scoreId, String scoreBattingOut) {
        this.scoreId = scoreId;
        this.scoreBattingOut = scoreBattingOut;
    }
    
    public long getScoreId() {
		return scoreId;
	}
	public String getscoreBattingOut() {
		return scoreBattingOut;
	}
}

