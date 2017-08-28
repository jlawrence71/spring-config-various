package com.jbl.example.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages={"com.jbl.example.javaconfig"})
public class Application {

    @Bean
    MessageService theMessageService() {
        return new MessageService() {
            public String getMessage() {
              return "You have a message !";
            }
        };
    }
        
  public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
      MessagePrinter msgPrinter  = context.getBean(MessagePrinter.class);
      msgPrinter.printMessage();
  }
}