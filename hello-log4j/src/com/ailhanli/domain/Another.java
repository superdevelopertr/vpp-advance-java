package com.ailhanli.domain;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Another {
	static Logger logger = LogManager.getLogger(Another.class);
	
	public void testMethod() {
		logger.trace("Hello trace from another");
		logger.debug("Hello debug from another");
		logger.info("Hello info from another");
		logger.warn("Hello warn from another");
		logger.fatal("Hello fatal from another");
	}
}
