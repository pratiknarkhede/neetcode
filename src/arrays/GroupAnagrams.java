package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
			String strs[]= {"eat","tea","tan","ate","nat","bat"};
			List<List<String>> list=groupAnagrams(strs);
			System.out.println(list.toString());
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		String temp;
		List<List<String>> list=new ArrayList();
		for(int i=0;i<strs.length;i++) {
			char chArr[]=strs[i].toCharArray();
			Arrays.sort(chArr);
			temp=String.valueOf(chArr);
			System.out.println(strs[i]);
		}
		return list;
	}
}
