package com.ailhanli;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Another {
	static Logger logger = LogManager.getLogger();
	
	public void testMethod() {
		logger.trace("Hello trace from another");
		logger.debug("Hello debug from another");
		logger.info("Hello info from another");
		logger.warn("Hello warn from another");
		logger.fatal("Hello fatal from another");
	}
}
