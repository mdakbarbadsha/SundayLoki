package com.upskill.java_1;

public class Variable {

	// Variables in java
	
	public String country = "USA";					//Instance OR global variable - variables declared in class level, outside method
	
	public String country2 = "Russia";
	
	public static String region = "America";		//Static variable - variables belong to class and don't required creating object
	
	public static void main(String[] args) {		
		
		String city = "New York";					//Local variable - variables declared in methods
	method("Essex");
	}
	
	public static void method(String county){				//Method parameter - variables used as method parameter
	
		String city = "Bloomfield";
		
		String myCounty = county;
		
	}
	
	public void test(){
		
		String city = "Buffalo";
	}
		
}		
