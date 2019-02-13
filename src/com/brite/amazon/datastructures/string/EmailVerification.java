package com.brite.amazon.datastructures.string;

import java.util.HashSet;
import java.util.Set;

public class EmailVerification {

	public int numUniqueEmails(String[] emails) {
		Set<String> seen = new HashSet();
		for (String email : emails) {
			int i = email.indexOf('@');
			String local = email.substring(0, i);
			
			String rest = email.substring(i);
			
			if (local.contains("+")) {
				local = local.substring(0, local.indexOf('+'));
			}
			local = local.replaceAll(".", "");
			
			
			seen.add(local + rest);
			
		}
		seen.stream().forEach((s)->System.out.println(s));
		
		return seen.size();
	}

	public static void main(String[] args) {
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		
		EmailVerification ev= new EmailVerification();
		System.out.println(ev.numUniqueEmails(emails));

	}
}
