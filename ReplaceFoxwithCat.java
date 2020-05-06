//The quick brown fox jumps over the lazy dog. 

//Replace "fox"  with "cat" 
//
//The quick brown cat jumps over the lazy dog.

//Test Cases
//case1: Verify for given scenario
//Case 2: verify for invalid scenario  (t="sky" output: the word should not be replaced.
//Case 3: Verify for null input (t=null output: the word should not be replaced.

package puzzles;

import java.util.Scanner;

public class ReplaceFoxwithCat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the word to be replaced:");
		String t = sc.nextLine();
		System.out.println("Enter the word to replace:");
		String s = sc.nextLine();
		replace(t, s);
	}

	public static void replace(String a, String b) {
		String s1 = "The quick brown fox jumps over the lazy dog.";
		String[] s = s1.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(a)) {
				s[i] = s[i].replace(a, b);
				break;
			}
		}

		StringBuffer sb = new StringBuffer();
		for (String x : s) {
			sb.append(x + " ");
		}
		s1 = sb.toString();
		System.out.println(s1);
	}
}
