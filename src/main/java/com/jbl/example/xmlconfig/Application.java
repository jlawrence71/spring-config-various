package com.jbl.example.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    
  public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      MessagePrinter msgPrinter = (MessagePrinter) context.getBean("msgPrinter");
      msgPrinter.printMessage();
  }
}