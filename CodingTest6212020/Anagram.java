//Program to check if two Strings are anagrams of each other? With test cases.

package CodingTest6212020;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
		Anagram an = new Anagram();
		an.anagram(s1, s2);
	}

	public void anagram(String s1, String s2) {
		String s3 = s1.replaceAll(" ", "");
		String s4 = s2.replaceAll(" ", "");
		if (s3.length() != s4.length()) {
			System.out.println("Its not an anagram**");
		} else {
			char[] str1 = s3.toLowerCase().toCharArray();
			char[] str2 = s4.toLowerCase().toCharArray();

			Arrays.sort(str1);
			Arrays.sort(str2);

			if (Arrays.equals(str1, str2)) {
				System.out.println("its an anagram");
			} else {
				System.out.println("its not an anagram");
			}
		}
	}

}
