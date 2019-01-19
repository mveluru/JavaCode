package come.brite.other;

import java.util.Arrays;

public class Anagram {
	
	
	private boolean anagram(String s1,String s2){
	    char[] c1 =s1.toCharArray();
	    char[] c2= s2.toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    for(int i=0;i<c1.length;i++){
	    	if(c1[i]!=c2[i]){
	    		return false;
	    	}
	    }
		return true;
	}
public static void main(String[] args) {
	 //String s1 = "restful";
	 //String s2 = "fluster";
	 String s1 = "cinema";
	 String s2 = "iceman";
	 
	 Anagram a = new Anagram();
	 System.out.println(a.anagram(s1, s2));
	
}
}
