package com.pentaqueue.factory;

import java.util.logging.Level;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;

public class Api {

	private static final String API_KEY = "RGAPI-ce65ed32-b70d-4053-9a2c-4e1b117b5770";
	
	public static RiotApi getRiotApi() {
		ApiConfig config = new ApiConfig().setDebugLevel(Level.FINEST).setKey(API_KEY);
		return new RiotApi(config);
	}
}
