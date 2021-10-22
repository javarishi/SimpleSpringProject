package com.h2kinfosys.spring;

public class SpellChecker {
	
	public SpellChecker() {
		System.out.println("SpellChecker Constructor");
	}
	
	private String dictionaryName;

	public String getDictionaryName() {
		return dictionaryName;
	}

	public void setDictionaryName(String dictionaryName) {
		this.dictionaryName = dictionaryName;
	}
	

}
