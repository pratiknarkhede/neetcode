package slidingWindow;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abcabcbb";
		int len = lengthOfLongestSubstring(str);
		System.out.println(" " + len);
	}
	// a b c a b c b b
	// 0 1 2 3 4 5 6 7 
	// l=0 r=1
	//set {a,b,c}
	//maintaining sliding window of non repeating characters starting from l to r
	//used HashSet as window and removing leftmost element from set whenever duplicate element is added
	private static int lengthOfLongestSubstring(String str) {
		int length = str.length();
		if(length<=1) {
			return length;
		}
		int l=0,r=0,maxCount=0;
		char temp=' ';
		char[] arr=str.toCharArray();
		HashSet<Character> set=new HashSet<>();
		while(r<arr.length) {
			temp=arr[l];
			if(set.add(arr[r])) {
				r++;
			}else {
				set.remove(temp);
				l++;	
			}
			if(set.size()>maxCount) {
				maxCount=set.size();
			}
				
			
		}
		return maxCount;
	}

	

}
