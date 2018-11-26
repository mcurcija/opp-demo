package com.example.opp.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

public class OPPClient {

	public OPPResponse initCheckout() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("https://test.oppwa.com/v1/checkouts");
		Form data = new Form();
		data.param("authentication.userId", "8a8294174e735d0c014e86d5e0ee217b");
		data.param("authentication.password", "74nrfbej8a");
		data.param("authentication.entityId", "8a8294174e735d0c014e86d5e0db2177");
		data.param("amount", "42.00");
		data.param("currency", "EUR");
		data.param("paymentType", "PA");
		OPPResponse response = target.request(MediaType.APPLICATION_JSON).post(Entity.form(data), OPPResponse.class);
		System.out.println("OPPClient.initCheckout(): " + response);
		return response;
	}
	
}
