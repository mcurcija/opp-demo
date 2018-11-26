package com.example.opp.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.opp.client.OPPClient;

@Path("/")
public class PaymentRS {

	@GET
	@Produces({MediaType.TEXT_HTML})
	public Response init() {
		String checkoutId = new OPPClient().initCheckout().id;
		return Response.ok(buildResponse(checkoutId), MediaType.TEXT_HTML).build();
	}

	private String buildResponse(String checkoutId) {
		return "<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"<head>\n" + 
				"<meta charset=\"UTF-8\">\n" + 
				"<script src=\"https://test.oppwa.com/v1/paymentWidgets.js?checkoutId=" + checkoutId + "\"></script>\n" + 
				"<title>OPP demo</title>\n" + 
				"</head>\n" + 
				"<body>\n" + 
				"<form action=\"processResult\" class=\"paymentWidgets\" data-brands=\"VISA MASTER AMEX\"></form>\n" + 
				"</body>\n" + 
				"</html>";
	}
}
