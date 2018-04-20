package org.test.brackets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHEDULE")


public class Schedule {

		@Id
		@Column(name="SCHEDULE_ID")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		Long id;
		
		@Column(name="SCHEDULE_MATCH_NAME")
		String scheduleMatchName;

		@Column(name="SCHEDULE_TIME")
		String scheduleTime;
		
		@Column(name="SCHEDULE_GROUND_ID")
		String scheduleGroundId;
		
		@Column(name="SCHEDULE_TEAM1_GROUP_ID")
		String scheduleTeam1GroupId;

		@Column(name="SCHEDULE_TEAM2_GROUP_ID")
		String scheduleTeam2GroupId;

		@Column(name="SCHEDULE_WINNER_TEAM_ID")
		String scheduleWinnerTeamId;

		@Column(name="SCHEDULE_LOSER_TEAM_ID")
		String scheduleLoserTeamId;

		@Column(name="SCHEDULE_TIED")
		String scheduleTied;

		@Column(name="SCHEDULE_NR")
		String scheduleNr;

		@Column(name="SCHEDULE_COMMENTS")
		String scheduleComments;
		
		
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getScheduleMatchName() {
			return scheduleMatchName;
		}

		public void setScheduleMatchName(String scheduleMatchName) {
			this.scheduleMatchName = scheduleMatchName;
		}

		public String getScheduleTime() {
			return scheduleTime;
		}

		public void setScheduleTime(String scheduleTime) {
			this.scheduleTime = scheduleTime;
		}

		public String getScheduleTeam1GroupId() {
			return scheduleTeam1GroupId;
		}

		public void setScheduleTeam1GroupId(String scheduleTeam1GroupId) {
			this.scheduleTeam1GroupId = scheduleTeam1GroupId;
		}

		public String getScheduleGroundId() {
			return scheduleGroundId;
		}

		public void setScheduleGroundId(String scheduleGroundId) {
			this.scheduleGroundId = scheduleGroundId;
		}

		public String getScheduleComments() {
			return scheduleComments;
		}

		public void setScheduleComments(String scheduleComments) {
			this.scheduleComments = scheduleComments;
		}
				
		public String getScheduleTeam2GroupId() {
			return scheduleTeam2GroupId;
		}

		public void setScheduleTeam2GroupId(String scheduleTeam2GroupId) {
			this.scheduleTeam2GroupId = scheduleTeam2GroupId;
		}
		
		public String getScheduleWinnerTeamId() {
			return scheduleWinnerTeamId;
		}

		public void setScheduleWinnerTeamId(String scheduleWinnerTeamId) {
			this.scheduleWinnerTeamId = scheduleWinnerTeamId;
		}

		public String getScheduleLoserTeamId() {
			return scheduleLoserTeamId;
		}

		public void setScheduleLoserTeamId(String scheduleLoserTeamId) {
			this.scheduleLoserTeamId = scheduleLoserTeamId;
		}

		public String getScheduleTied() {
			return scheduleTied;
		}

		public void setScheduleTied(String scheduleTied) {
			this.scheduleTied = scheduleTied;
		}

		public String getScheduleNr() {
			return scheduleNr;
		}

		public void setScheduleNr(String scheduleNr) {
			this.scheduleNr = scheduleNr;
		}

	}
