package arrays;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		int nums[] = { 1, 0, 3, 6, 5, 0 };
		boolean containsDuplicate = containsDuplicate3(nums);
		System.out.println("given array contains duplicate  " + containsDuplicate);

	}

	// times limit exceeds

	public static boolean containsDuplicate1(int[] nums) {

		int length = nums.length;
		if (length < 2)
			return false;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (nums[i] == nums[j])
					return false;
			}
		}
		return true;

	}

	// passes time limit   uses extra space hashset
	public static boolean containsDuplicate2(int[] nums) {
		int nums2[] = Arrays.stream(nums).distinct().toArray();
		if (nums.length == nums2.length) {
			return false;
		} else
			return true;
	}

	public static boolean containsDuplicate3(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}
	
	

}
