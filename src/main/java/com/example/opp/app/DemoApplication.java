package com.example.opp.app;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class DemoApplication extends Application {

	public DemoApplication() {
		System.out.println("DemoApplication.DemoApplication()");
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return Collections.singleton(PaymentRS.class);
	}
}
