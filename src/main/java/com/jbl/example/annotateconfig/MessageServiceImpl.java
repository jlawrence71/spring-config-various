package com.jbl.example.annotateconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("msgService")
public class MessageServiceImpl implements MessageService{

	@Value("${message:Please define message in your property file.  Thanks}")
	private String message;
	
	public MessageServiceImpl(){
		
	}
	
	public MessageServiceImpl(String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
