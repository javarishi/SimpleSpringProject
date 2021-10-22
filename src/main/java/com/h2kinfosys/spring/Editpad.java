package com.h2kinfosys.spring;

public class Editpad {
	
	public Editpad() {
		System.out.println("Editpad Created");
	}
	
	private String language;
	private SpellChecker spellChecker;
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public String getLanguage() {
		System.out.println("language set :: " + language);
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Editpad [language=" + language + ", spellChecker=" + spellChecker.getDictionaryName() + "]";
	}

	


}
