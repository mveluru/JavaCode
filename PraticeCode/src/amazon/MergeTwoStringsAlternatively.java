package com.brite.amazon;

public class MergeTwoStringsAlternatively {

	public void mergeTwoArrays(String a, String b) {
		StringBuffer sb = new StringBuffer();
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		int lenC = c.length;
		int lenD = d.length;
		if (lenC == lenD) {
			for (int i = 0; i < lenC; i++) {

				sb.append(c[i]).append(d[i]);

			}
		} else if (lenC < lenD) {
			for (int i = 0; i < lenC; i++) {

				sb.append(c[i]).append(d[i]);

			}
			
			for (int i = lenC; i < lenD; i++) {
				sb.append(d[i]);
			}
		} else if (lenC > lenD) {
			for (int i = 0; i < lenD; i++) {

				sb.append(c[i]).append(d[i]);

			}
			
			for (int i = lenD; i < lenC; i++) {
				sb.append(c[i]);
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		MergeTwoStringsAlternatively mergeTwoString = new MergeTwoStringsAlternatively();
		mergeTwoString.mergeTwoArrays("geeks", "forgeeks");
		mergeTwoString.mergeTwoArrays("hello", "geeks");
	}

}
