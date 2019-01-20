package com.brite.miscellaneous;

public class CaseStatement {

	public static void main(String[] args) {
		String day = "CSE"; 
        String dayString; 
        switch(day){
        case "CSE":
        	dayString ="Monday";
        
        
        default:
        	dayString ="Sunday";
        }
        System.out.println(dayString);
	}
}
