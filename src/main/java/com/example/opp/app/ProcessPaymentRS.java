package com.example.opp.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.opp.client.OPPClient;
import com.example.opp.client.OPPResponse;

public class ProcessPaymentRS extends BaseRS {

	@GET
	@Produces({ MediaType.TEXT_HTML })
	@Path("/process")
	public Response process(@QueryParam("id") String id) throws Exception {
		try {
			OPPClient client = new OPPClient();
			OPPResponse details = client.getDetails(id);
			
			if ("000.100.110".equals(details.result.code)) {
				// good case
				return Response.ok(
						buildContent("result.html", details.id, details.card.bin, details.card.last4Digits,
								details.card.holder, details.card.expiryMonth + "/" + details.card.expiryYear),
						MediaType.TEXT_HTML).build();
			}
			return Response.ok(
					buildContent("error.html", 
							details.result.code, 
							details.result.description), 
					MediaType.TEXT_HTML).build();
		} catch (Exception e) {
			return Response.ok(
					buildContent("error.html", 
							e.getMessage(), 
							e.getClass().getName()), 
					MediaType.TEXT_HTML).build();
		}
	}
}
