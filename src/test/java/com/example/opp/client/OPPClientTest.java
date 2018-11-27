package com.example.opp.client;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OPPClientTest {

	@Test
	public void initAndGetDetails() {
		OPPClient oppClient = new OPPClient();
		OPPResponse initResponse = oppClient.initCheckout();
		assertNotNull(initResponse.id);
		OPPResponse detailsResponse = oppClient.getDetails(initResponse.id);
		assertNotNull(detailsResponse.id);
	}

}
