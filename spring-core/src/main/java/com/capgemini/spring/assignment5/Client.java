package com.capgemini.spring.assignment5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Client {
	@Autowired
	int clientCode;
	
	String clientName;
	public int getClientCode() {
		return clientCode;
	}
	
	@Required
	public void setClientCode(int clientCode) {
		this.clientCode = clientCode;
	}
	public String getClientName() {
		return clientName;
	}
	@Required
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public void display()
	{
		System.out.println(clientCode);
		System.out.println(clientName);
	}
}
