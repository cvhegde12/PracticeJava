//Given a string s and a string t, check if s is subsequence of t.

//You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).
//
//A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
//
//Example 1:
//s = "abc", t = "ahbgdc"
//
//Return true.
//
//Example 2:
//s = "axc", t = "ahbgdc"

//Return false.

//Test cases:
//	case 1: Verify with One word String s = "abc", t = "ahbgdc" (both true and false scenarios)
//Case 2: Verify with String with Space s = "tab" t= "test abc" (both true and false scenarios)
//case 3 : Verify for null value. (check for null string, null substring and both string and substring are null)

package Revision_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubStringOfmainString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String:");
		String t = sc.nextLine();
		System.out.println("Enter the substring:");
		String s = sc.nextLine();
		subString(t, s);
	}

	public static void subString(String t, String s) { // method 1
		boolean flag = false;
		if (t.equals("") || s.equals("")) {
			System.out.println("Invalid Input");
			return;
		}
		char[] arr1 = t.toCharArray();
		char[] arr2 = s.toCharArray();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == (arr2[j])) {
					flag = true;
				}
			}
		}
		if (flag) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static void subString2(String t, String s) { // method 2
		if (t.equals("") || s.equals("")) {
			System.out.println("Invalid Input");
			return;
		}
		char[] arr1 = t.toCharArray();
		char[] arr2 = s.toCharArray();
		List<char[]> list1 = Arrays.asList(arr1);

		List<Character> l1 = new ArrayList<Character>();
		for (char x : list1.get(0)) {
			l1.add(x);
		}
		System.out.println(l1);

		List<char[]> list2 = Arrays.asList(arr2);
		List<Character> l2 = new ArrayList<Character>();
		for (char x : list2.get(0)) {
			l2.add(x);
		}
		System.out.println(l2);

		if (l1.containsAll(l2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
