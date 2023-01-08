package com.upskill.java_4;

public class Encapsulation {

private String name = "upskill";
private int ssn = 5513584;
private String username = "badsha";

public void setName(String value){
	name = value;
	
	}

//Getter Method - name
public String getName(){
	return name;
	
}



public static void main(String[] args) {
	
	Encapsulation obj = new Encapsulation();
	
	obj.setName("upskill2");
	System.out.println(obj.getName());
}

}
