package com.ailhanli.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.ailhanli.domain.Another;

public class HelloLog {
	static Logger logger = LogManager.getLogger(HelloLog.class);

	public static void main(String[] args) {
		logger.trace("hello trace");
		logger.debug("hello debug");
		logger.info("hello info");
		logger.warn("hello warn");
		logger.error("hello error");
		logger.fatal("hello fatal");
		
		new Another().testMethod();
	}
}