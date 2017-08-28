package com.jbl.example.annotateconfig;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  private static Logger logger = Logger.getLogger(Application.class);

    
  public static void main(String[] args) {
	  
	  logger.info("Starting Application");
	  
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotate.xml");
      MessagePrinter msgPrinter = (MessagePrinter) context.getBean("msgPrinter");
      msgPrinter.printMessage();
      
      logger.debug("Finishing Application");
  }
}