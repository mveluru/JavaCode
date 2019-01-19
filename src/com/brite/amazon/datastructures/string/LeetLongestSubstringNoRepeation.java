package com.brite.amazon.datastructures.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetLongestSubstringNoRepeation {

	  public int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        int ans = 0;
	        for (int i = 0; i < n; i++)
	            for (int j = i + 1; j <= n; j++)
	                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
	        return ans;
	    }

	    public boolean allUnique(String s, int start, int end) {
	        Set<Character> set = new HashSet<>();
	        for (int i = start; i < end; i++) {
	            Character ch = s.charAt(i);
	            if (set.contains(ch)) return false;
	            set.add(ch);
	        }
	        return true;
	    }

	public static void main(String[] args) {
		LeetLongestSubstringNoRepeation lss = new LeetLongestSubstringNoRepeation();
		System.out.println(lss.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX"));;
	}
}
