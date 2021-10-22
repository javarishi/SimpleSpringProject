package com.h2kinfosys.spring;

public class HelloSpring {
	
	public HelloSpring(String language) {
		System.out.println("HelloSpring Constructor");
		System.out.println("language is :: "+ language);
		this.language = language;
	}

	private String message;
	private String language;

	public void start() {
		System.out.println("Init method for HelloSpring");
	}
	
	public void end() {
		System.out.println("Destroy method for HelloSpring");
	}
	
	public String getMessage() {
		System.out.println("Message is :: "+ message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLanguage() {
		System.out.println("language is :: "+ language);
		return language;
	}

	
	
}
