package come.brite.other;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Question6 {
	 String str;
	 Question6(String str) {
         this.str = str;
     }
	  
	 
	     public static void main(String[] args) {
	    	 String [] fruits = {"apple", "banana", "mango", "orange"};
	         for(String fruit : fruits) {
	             System.out.print(fruit + " ");
	             if(fruit.equals("mango")) {
	                 continue;
	             }
	             System.out.println("salad!");
	             break;
	         }        
	     }
}

