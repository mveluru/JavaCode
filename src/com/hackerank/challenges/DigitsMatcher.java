package com.hackerank.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsMatcher {

public static void main(String[] args) {
	String input = "Hack101";
	Pattern p = Pattern.compile("[\\D]");
	Matcher m = p.matcher(input);
	int count=0;
	StringBuffer sb = new StringBuffer();
	while(m.find()) {
		sb.append(m.group(0));
		 
		count++;
     
	}
	System.out.println(sb.toString()+"\n"+count);
	
	String text    =
            "This is the text to be searched " +
            "for occurrences of the pattern.";

        String pattern = ".*is.*";

        boolean matches = Pattern.matches(pattern, text);

        System.out.println("matches = " + matches);
	
        String patternString = "searched";
        Pattern patterns = Pattern.compile(patternString);
        
        String pattern2 = patterns.pattern();
        System.out.println(pattern2);
	
        
        String[] split = patterns.split(text);
        for(String element : split){
            System.out.println("element = " + element);
        }
        
        
        
        
        Pattern p1 = Pattern.compile("[a-zA-Z_0-9]{3}+\\.[a-zA-Z_0-9]{3}+\\.[a-zA-Z_0-9]{3}+\\.[a-zA-Z_0-9]{3}+");
 		Matcher m1 = p1.matcher("123.456.abc.def");
 		boolean match = m1.matches();
        
        System.out.format("%s", match);
        
}
}
