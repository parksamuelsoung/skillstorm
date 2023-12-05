package com.skillstorm;

import java.util.Arrays;
import java.util.Objects;

public class Programmer {
	
	private static final int MAX_LANGUAGES = 15;
	private String name;
	private String company;
	private String[] languages = new String[MAX_LANGUAGES];
	private int languagesCounter;
	
	public Programmer() {
		
	}
	
	public Programmer(String name, String company, String[] languages) {
		this.name = name;
		this.company = company;
		this.languages = languages;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String[] getLanguages() {
		String[] returnedLanguages = new String[languagesCounter];
		
		for(int i=0, j=0; i<languages.length; i++) {
			if(languages[i]!=null) {
				returnedLanguages[j++] = languages[i];
			}	
		}
		return returnedLanguages;
	}
	
	public void learnLanguage(String language) {
		if(!language.isEmpty()) {
			this.languages[languagesCounter] = language.toLowerCase();
			this.languagesCounter++;
		} else {
			System.out.println("Language cannot be empty.");
		}
	}
	
	public void deleteLanguage(String language) {
		boolean languageFound = false;
		
		for(int i=0; i<getLanguages().length; i++) {
			if(getLanguages()[i] != null && getLanguages()[i].equals(language.toLowerCase())) {
				languages[i] = null;
				languagesCounter--;
				languageFound = true;
				break;
			}
		}
		
		if(!languageFound) {
			System.out.println("Invalid Language");
		}
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s %nCompany: %s %nLanguages: %s"
				, name, company, Arrays.toString(getLanguages()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(languages);
		result = prime * result + Objects.hash(company, languagesCounter, name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programmer other = (Programmer) obj;
		return Arrays.equals(languages, other.languages);
	}
	

	

}
