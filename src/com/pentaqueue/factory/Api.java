package com.pentaqueue.factory;

import java.util.logging.Level;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;

public class Api {

	private static final String API_KEY = "RGAPI-8f56e520-3735-4b46-abd5-6f265b1d9d26";
	
	public static RiotApi getRiotApi() {
		ApiConfig config = new ApiConfig().setDebugLevel(Level.FINEST).setKey(API_KEY);
		return new RiotApi(config);
	}
}
