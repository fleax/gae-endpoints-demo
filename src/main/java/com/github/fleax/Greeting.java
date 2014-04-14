package com.github.fleax;

import java.util.ArrayList;

import javax.inject.Named;

import com.google.api.server.spi.config.Api;

/**
 * Defines v1 of a helloworld API, which provides simple "greeting" methods.
 */
@Api(name = "helloworld", version = "v1")
public class Greeting {
	public static ArrayList<HelloGreeting> greetings = new ArrayList<HelloGreeting>();

	static {
		greetings.add(new HelloGreeting("hello world!"));
		greetings.add(new HelloGreeting("goodbye world!!!"));
	}

	public HelloGreeting getGreeting(@Named("id") Integer id) {
		return greetings.get(id);
	}
}