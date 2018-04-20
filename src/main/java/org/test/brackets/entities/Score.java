package org.test.brackets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCORE")
public class Score {

	@Id
	@Column(name="SCORE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="SCORE_SCHEDULE_ID")
	String scoreScheduleId;
	
	@Column(name="SCORE_TEAM_ID")
	String scoreTeamId;

	@Column(name="SCORE_PLAYER_ID")
	String scorePlayerId;
	
	@Column(name="SCORE_BATTING_RUNS")
	String scoreBattingRuns;
	
	@Column(name="SCORE_BATTING_BALLS")
	String scoreBattingBalls;
	
	@Column(name="SCORE_BATTING_4S")
	String scoreBatting4s;
	
	@Column(name="SCORE_BATTING_6S")
	String scoreBatting6s;
	
	@Column(name="SCORE_BATTING_OUT")
	String scoreBattingOut;
	
	@Column(name="SCORE_BATTING_WICKET_ID")
	String scoreBattingWicketId;
	
	@Column(name="SCORE_BOWLING_RUNS")
	String scoreBowlingRuns;
	
	@Column(name="SCORE_BOWLING_BALLS")
	String scoreBowlingBalls;
	
	@Column(name="SCORE_BOWLING_WKTS")
	String scoreBowlingWkts;
	
	@Column(name="SCORE_COMMENTS")
	String scoreComments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScoreScheduleId() {
		return scoreScheduleId;
	}

	public void setScoreScheduleId(String scoreScheduleId) {
		this.scoreScheduleId = scoreScheduleId;
	}

	
	public String getScoreTeamId() {
		return scoreTeamId;
	}

	public void setScoreTeamId(String scoreTeamId) {
		this.scoreTeamId = scoreTeamId;
	}

	public String getScorePlayerId() {
		return scorePlayerId;
	}

	public void setScorePlayerId(String scorePlayerId) {
		this.scorePlayerId = scorePlayerId;
	}

	public String getScoreBattingRuns() {
		return scoreBattingRuns;
	}

	public void setScoreBattingRuns(String scoreBattingRuns) {
		this.scoreBattingRuns = scoreBattingRuns;
	}

	public String getScoreBattingBalls() {
		return scoreBattingBalls;
	}

	public void setScoreBattingBalls(String scoreBattingBalls) {
		this.scoreBattingBalls = scoreBattingBalls;
	}

	public String getScoreBatting4s() {
		return scoreBatting4s;
	}

	public void setScoreBatting4s(String scoreBatting4s) {
		this.scoreBatting4s = scoreBatting4s;
	}

	public String getScoreBatting6s() {
		return scoreBatting6s;
	}

	public void setScoreBatting6s(String scoreBatting6s) {
		this.scoreBatting6s = scoreBatting6s;
	}

	public String getScoreBattingOut() {
		return scoreBattingOut;
	}

	public void setScoreBattingOut(String scoreBattingOut) {
		this.scoreBattingOut = scoreBattingOut;
	}

	public String getScoreBattingWicketId() {
		return scoreBattingWicketId;
	}

	public void setScoreBattingWicketId(String scoreBattingWicketId) {
		this.scoreBattingWicketId = scoreBattingWicketId;
	}

	public String getScoreBowlingRuns() {
		return scoreBowlingRuns;
	}

	public void setScoreBowlingRuns(String scoreBowlingRuns) {
		this.scoreBowlingRuns = scoreBowlingRuns;
	}

	public String getScoreBowlingBalls() {
		return scoreBowlingBalls;
	}

	public void setScoreBowlingBalls(String scoreBowlingBalls) {
		this.scoreBowlingBalls = scoreBowlingBalls;
	}

	public String getScoreBowlingWkts() {
		return scoreBowlingWkts;
	}

	public void setScoreBowlingWkts(String scoreBowlingWkts) {
		this.scoreBowlingWkts = scoreBowlingWkts;
	}

	public String getScoreComments() {
		return scoreComments;
	}

	public void setScoreComments(String scoreComments) {
		this.scoreComments = scoreComments;
	}
}
