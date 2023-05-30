package com.capgemini.spring.assigment3;

public class Batch {

	String id;
	String domain;
	String code;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString()
	{
		return id+" "+domain+" "+code;
	}
}
