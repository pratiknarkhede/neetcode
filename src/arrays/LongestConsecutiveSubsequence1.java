package arrays;

import java.util.HashMap;

public class LongestConsecutiveSubsequence1 {
	// time limit exceeds
	public static void main(String[] args) {
		int arr[] = { 100, 4, 200, 1, 3, 2 };
		int lcs = longestConsecutive(arr);

		System.out.println("lcs  " + lcs);
	}

	private static int longestConsecutive(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0, next = 0;
		for (int a : arr) {
			map.put(a, 0);
		}
		map = getConsecutiveCount(map);
		count = getMaxConsecutiveCount(map);
		//map.forEach((k, v) -> System.out.println(k.intValue() + " " + v.intValue()));
		return count;
	}

	private static int getMaxConsecutiveCount(HashMap<Integer, Integer> map) {
		int count = 0;
		for (Integer val : map.values()) {
			if (val > count) {
				count = val;
			}
		}
		return count;
	}

	private static HashMap<Integer, Integer> getConsecutiveCount(HashMap<Integer, Integer> map) {
		int a = 0;
		//O(n^2)
		for(Integer key : map.keySet()) {
			a = key;
			while (map.containsKey(a)) {
				map.put(key, map.get(key) + 1);
				a++;
			}
		}
		return map;
	}

}
