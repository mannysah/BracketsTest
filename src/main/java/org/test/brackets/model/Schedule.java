package org.test.brackets.model;

public class Schedule {
	private long scheduleId;
    private String scheduleMatchName;

    public Schedule(long scheduleId, String scheduleMatchName) {
        this.scheduleId = scheduleId;
        this.scheduleMatchName = scheduleMatchName;
    }
    
    public long getscheduleId() {
		return scheduleId;
	}
	public String getscheduleMatchName() {
		return scheduleMatchName;
	}
}
