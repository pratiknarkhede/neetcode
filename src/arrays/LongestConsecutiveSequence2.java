package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence2 {

	public static void main(String[] args) {

		int arr[] = {100,4,200,1,3,2};
		int lcs = longestConsecutive(arr);

		System.out.println("lcs  " + lcs);
	}
	/* we are picking longest one among present sequences 
	 * 100(1)
	 * 4(it is not starting of sequence since (4-1) is present in set)
	 * 200(1)
	 * 1 (2 3 4) (4)
	 * 3 (not start if sequence)
	 * 2 (not start if sequence)
	 * */
	

	private static int longestConsecutive(int[] arr) {
		int length = arr.length;
		if (length == 0 || length == 1)
			return length;
		int count = 1, max = 1;
		HashSet<Integer> set = new HashSet<>();
		for (int a : arr) {
			set.add(a);
		}
		for (int a : arr) {
			if (!set.contains(a - 1)) {
				while (set.contains(++a)) {
					count++;
				}
				if (count > max) {
					max = count;
				}

			}
			count=1;

		}

		return max;
	}

}
