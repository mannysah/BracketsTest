package org.test.brackets.model;

public class Result {
	private long resultId;
    private String resultComments;

    public Result(long resultId, String resultComments) {
        this.resultId = resultId;
        this.resultComments = resultComments;
    }
    
    public long getResultId() {
		return resultId;
	}
	public String getresultComments() {
		return resultComments;
	}
}

