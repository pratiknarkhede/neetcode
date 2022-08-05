package twopointers;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "aa";
		s = formatString(s);
		System.out.println(s);
		boolean ifPalindrome = isPalindrome(s);
		System.out.println("string is palindrome "+ifPalindrome);

	}

	private static String formatString(String s) {
		return s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
	}

	public static boolean isPalindrome(String s) {
		s=formatString(s);
		if(s.isEmpty())return true;
		char[] chArray = s.toCharArray();
		int i = 0, j = chArray.length - 1;
		while (i != j  && i<j) {
			if (chArray[i] != chArray[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
