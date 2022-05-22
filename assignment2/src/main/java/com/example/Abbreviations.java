package com.example;

import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

	private Map<String, String> abbrevationMap = new HashMap<String, String> ();
	
	//no arg constructor
	public Abbreviations() {
		
	}

	
	public void addAbbreviation(String abbreviation, String explanation) {
		
		abbrevationMap.put(abbreviation, explanation);
	}
	
	//check if abbrevation is already added
	public boolean hasAbbreviation(String abbreviation) {
		if (this.abbrevationMap.containsKey(abbreviation)) {
			return true;
		}
		return false;
	}
	
	public String findExplanationFor(String abbreviation) {
		String abbrevation = null;
		if (this.abbrevationMap.containsKey(abbreviation)) {
			abbrevation =  this.abbrevationMap.get(abbreviation);
		}
		return abbrevation;
	}
	
	
	
	public static void main(String[] args) {
		Abbreviations abbreviations = new Abbreviations();
		abbreviations.addAbbreviation("e.g.", "for example");
		abbreviations.addAbbreviation("etc.", "and so on");
		abbreviations.addAbbreviation("i.e.", "more precisely");
		
		String text = "e.g. i.e. etc. lol";

		for (String part: text.split(" ")) {
		    if(abbreviations.hasAbbreviation(part)) {
		        part = abbreviations.findExplanationFor(part) +"\n";
		    }else { 
		    	part = null;
		    }

		    System.out.print(part);
		    System.out.print(" ");
		
	}

	}
}
