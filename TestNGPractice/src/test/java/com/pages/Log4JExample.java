package com.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JExample {

	static Logger logger = LogManager.getLogger(Log4JExample.class);

	@Test
	public void loggerValidation() {
		logger.trace("This is the trace getting when start execution for this method");
		logger.debug("This is the debug getting when start execution for this method");
		logger.info("This is the information getting when start execution for this method");
		logger.warn("This is the warning message getting when start execution for this method");
		logger.error("This is the error message getting when start execution for this method");
		logger.fatal("This is the fetal message getting when start execution for this method");

	}

}
