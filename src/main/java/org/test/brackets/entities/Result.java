package org.test.brackets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESULT")
public class Result {

	@Id
	@Column(name="RESULT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="RESULT_SCHEDULE_ID")
	String resultScheduleId;
	
	@Column(name="RESULT_WINNER_TEAM_ID")
	String resultWinnerTeamId;
	
	@Column(name="RESULT_LOSER_TEAM_ID")
	String resultLoserTeamId;
	
	@Column(name="RESULT_SCORE_ID")
	String resultScoreId;
	
	@Column(name="RESULT_COMMENTS")
	String resultComments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResultScheduleId() {
		return resultScheduleId;
	}

	public void setResultScheduleId(String resultScheduleId) {
		this.resultScheduleId = resultScheduleId;
	}
	
	public String getResultWinnerTeamId() {
		return resultWinnerTeamId;
	}

	public void setResultWinnerTeamId(String resultWinnerTeamId) {
		this.resultWinnerTeamId = resultWinnerTeamId;
	}

	public String getResultLoserTeamId() {
		return resultLoserTeamId;
	}

	public void setResultLoserTeamId(String resultLoserTeamId) {
		this.resultLoserTeamId = resultLoserTeamId;
	}
	
	public String getResultScoreId() {
		return resultScoreId;
	}

	public void setResultScoreId(String resultScoreId) {
		this.resultScoreId = resultScoreId;
	}

	public String getResultComments() {
		return resultComments;
	}

	public void setResultComments(String resultComments) {
		this.resultComments = resultComments;
	}
}
