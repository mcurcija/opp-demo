package com.example.opp.app;

import java.io.IOException;
import java.text.MessageFormat;

import org.apache.commons.io.IOUtils;

public abstract class BaseRS {

	protected String buildContent(String templateName, String... arguments) throws IOException {
		String template = IOUtils.toString(this.getClass().getResource(templateName), "UTF-8");
		return MessageFormat.format(template, (Object[]) arguments);
	}

}