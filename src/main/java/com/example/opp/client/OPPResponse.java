package com.example.opp.client;

public class OPPResponse {

	public Result result;
	public String id;

	public String buildNumber;
	public String timestamp;
	public String ndc;

	public String paymentType;
	public String paymentBrand;
	public String amount;
	public String currency;
	public String descriptor;
	
	public Card card;
	
	public Risc risc;
	
	public ThreeDSecure threeDSecure;
	
	public static class Result {
		public String code;
		public String description;
		
		@Override
		public String toString() {
			return "Result [code=" + code + ", description=" + description + "]";
		}
	} 

	public static class Card {
		public String bin;
		public String last4Digits;
		public String holder;
		public String expiryMonth;
		public String expiryYear;
		
		@Override
		public String toString() {
			return "Card [bin=" + bin + ", last4Digits=" + last4Digits + ", holder=" + holder + ", expiryMonth="
					+ expiryMonth + ", expiryYear=" + expiryYear + "]";
		}
	} 

	public static class Risc {
		public String score;

		@Override
		public String toString() {
			return "Risc [score=" + score + "]";
		}
	} 

	public static class ThreeDSecure {
		public String eci;

		@Override
		public String toString() {
			return "ThreeDSecure [eci=" + eci + "]";
		}
		
	}

	@Override
	public String toString() {
		return "OPPResponse [result=" + result + ", id=" + id + ", buildNumber=" + buildNumber + ", timestamp="
				+ timestamp + ", ndc=" + ndc + ", paymentType=" + paymentType + ", paymentBrand=" + paymentBrand
				+ ", amount=" + amount + ", currency=" + currency + ", descriptor=" + descriptor + ", card=" + card
				+ ", risc=" + risc + ", threeDSecure=" + threeDSecure + "]";
	} 

}

