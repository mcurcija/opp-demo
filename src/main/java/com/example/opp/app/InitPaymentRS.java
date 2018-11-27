package com.example.opp.app;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.example.opp.client.OPPClient;

public class InitPaymentRS extends BaseRS {

	@Context
	UriInfo uriInfo;

	@GET
	@Produces({ MediaType.TEXT_HTML })
	@Path("/init")
	public Response init() throws Exception {
		String checkoutId = new OPPClient().initCheckout().id;
		URI processResultAction = uriInfo.getRequestUri().resolve("process");
		return Response.ok(buildContent("init.html", checkoutId, processResultAction.toString()), MediaType.TEXT_HTML).build();
	}
}
