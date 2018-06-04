package com.pentaqueue.factory;

import java.util.logging.Level;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;

public class Api {

	private static final String API_KEY = "RGAPI-2dfeaf3c-0c03-4cb6-acab-0c412424b2e5";
	
	public static RiotApi getRiotApi() {
		ApiConfig config = new ApiConfig().setDebugLevel(Level.FINEST).setKey(API_KEY);
		return new RiotApi(config);
	}
}
