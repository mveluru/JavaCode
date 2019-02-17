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
	
	private boolean anagram1(String s1,String s2) {
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.parallelSort(s1Array);
		Arrays.parallelSort(s2Array);
		if (s1Array.length ==s2.length()) {
			for(int i=0;i<s1Array.length;i++) {
				if(s1Array[i]!=s2Array[i]) {
					return false;
				}
			}
		}// end of if
		
		
		return true;
		
	}
public static void main(String[] args) {
	 //String s1 = "restful";
	 //String s2 = "fluster";
	 String s1 = "cinema";
	 String s2 = "iceman";
	 
	 Anagram a = new Anagram();
	 System.out.println(a.anagram(s1, s2));
	 System.out.println(a.anagram1(s1, s2));
	
}
}
