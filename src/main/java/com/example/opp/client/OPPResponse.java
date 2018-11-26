package com.example.opp.client;

public class OPPResponse {

	public Result result;
	public String buildNumber;
	public String timestamp;
	public String ndc;
	public String id;
	
	public static class Result {
		String code;
		String description;
	} 
	
	@Override
	public String toString() {
		return "OPPResponse [result=" + result + ", buildNumber=" + buildNumber + ", timestamp=" + timestamp + ", ndc="
				+ ndc + ", id=" + id + "]";
	}
}

