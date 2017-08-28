package com.jbl.example.xmlconfig;

public class MessageServiceImpl implements MessageService{

	private String message;
	
	public MessageServiceImpl(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
