package ck.learn.jpmfsd.a12.collections156Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		if(languages.containsKey("Java")) {
			System.out.println("Java is already there");
		} else {
			languages.put("Java", "a compiled high level, object-oriented, platform independent language");
			System.out.println("Java added successfully");
		}
		languages.put("Python", "an interpreted, object-oriented, high level programming language with dynamic semantics");
		languages.put("Algol", "an algorithmic language");
		System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
		System.out.println(languages.put("Lisp", "Therein lies madness"));
		
		System.out.println(languages.put("Java", "this course is about java"));
		System.out.println(languages.get("Java"));
		
		if(languages.containsKey("Java")) {
			System.out.println("Java is already there");
		} else {
			languages.put("Java", "awesome");
		}
		
		System.out.println("=========================================================================================");
		
//		languages.remove("Lisp");
		
		if(languages.remove("Algol", "a familiy of algorithmic languages")) {
			System.out.println("algol removed");
		} else {
			System.out.println("algol not removed. Key/value pair not found");
		}
		
		System.out.println("=========================================================================================");
		
		System.out.println(languages.replace("Lisp", "a fuctional programming language with imperative features"));
		System.out.println(languages.replace("Scala", "this will not be added"));
		

		if(languages.replace("Lisp", "a fuctional programming language with imperative features", "a familiy of algorithmic languages")) {
			System.out.println("Lisp replaced");
		} else {
			System.out.println("Lisp not replaced. Key/value pair not found");
		}
		
		System.out.println("=========================================================================================");
		
		for (String key : languages.keySet()) {
			System.out.println(key + " : " + languages.get(key));
		}
		
	}

}
