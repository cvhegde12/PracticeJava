//Sum of digits in alphanumeric string in Java

package CodingTest52020;

public class SumInAlphanumericString {

	public static void main(String[] args) {
		String s = "as4C51@";
		sum(s);
	}

	public static void sum(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(sum);
	}

}
