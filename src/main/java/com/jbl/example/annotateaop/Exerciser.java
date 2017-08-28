package com.jbl.example.annotateaop;

import org.apache.log4j.Logger;

public class Exerciser {

	private Logger logger = Logger.getLogger(Exerciser.class);

	public void before(){
		logger.info("In before()");
	}
	
	public void after(){
		logger.info("In after()");
	}

	public void around(){
		logger.info("In around()");
	}

	public int returnValue(){
		logger.info("In returnValue()");
		return 11;
	}
	
	public void causeException() throws Exception{
		logger.info("In causeException()");
		throw new Exception("Something bad");
	}
	
	
}
