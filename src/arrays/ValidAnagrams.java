package arrays;

import java.util.Arrays;

public class ValidAnagrams {

	public static void main(String[] args) {
		String s = "anagram", t = "nagarsm";
		boolean ifValidAnagram = isAnagram(s, t);
		System.out.println(" valid anagram ? "+ifValidAnagram);

	}
//passes leetcode test cases
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())return false;
		char arr1[]=s.toCharArray();
		char arr2[]=t.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.toString(arr1).equals(Arrays.toString(arr2))) return true;
		return false;
	}

}
