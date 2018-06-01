package com.pentaqueue.factory;

import java.util.logging.Level;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;

public class Api {

	private static final String API_KEY = "RGAPI-97048cd3-8b82-4bcf-80ca-6fb3e21afb97";
	
	public static RiotApi getRiotApi() {
		ApiConfig config = new ApiConfig().setDebugLevel(Level.FINEST).setKey(API_KEY);
		return new RiotApi(config);
	}
}
