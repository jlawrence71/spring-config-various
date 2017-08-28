package com.jbl.example.annotateaop;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	private static Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_aop.xml");
	      
		Exerciser obj = (Exerciser) context.getBean("exerciser");
		
		obj.before();
		obj.after();
		obj.around();
		obj.returnValue();
		
		try {
			obj.causeException();
		} catch (Exception e) {
			logger.info("Exception handled at the top level");
		}

	}

}
