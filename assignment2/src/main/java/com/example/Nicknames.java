package com.example;
import java.util.HashMap;
import java.util.Map;

// Store and print Nicknames from HashMap
public class Nicknames {
	static Map<String, String> nickNames  = new HashMap<String, String>();;
	public static void main(String[] args) {
		
		nickNames.put("matthew", "matt");
		nickNames.put("michael", "mix");
		nickNames.put("arthur", "artie");
		
		System.out.println("matthew's nickname is "+nickNames.get("matthew")); 
	}
}
