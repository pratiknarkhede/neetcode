package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {11, 2 ,9,5, 7};
		int target = 9;
		int sol[] = twoSum2(nums, target);
		System.out.println(Arrays.toString(sol));
	}

//O(n^2)
	public static int[] twoSum(int[] nums, int target) {
		int[] sol = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if ((nums[i] + nums[j] == target) && i != j) {
					sol[0] = i;
					sol[1] = j;
				}
			}
		}
		return sol;
	}
//using hashmap 
	public static int[] twoSum2(int[] nums, int target) {
		int[] sol = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		// 11, 2 ,9,5, 7		
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(target - nums[i])) {
				map.put(nums[i], i);
			}
			else {
				sol[1]=i;
				sol[0]=map.get(target - nums[i]);
			}
		}

		return sol;
	}


}
