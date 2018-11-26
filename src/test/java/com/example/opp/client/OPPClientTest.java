package com.example.opp.client;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OPPClientTest {

	@Test
	public void init() {
		OPPResponse response = new OPPClient().initCheckout();
		assertNotNull(response.id);
	}

}
