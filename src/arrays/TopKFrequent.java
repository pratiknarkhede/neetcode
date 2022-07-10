package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 6, 6, 6, 6, 6, 6 };
		int k = 3;
		int sol[] = topKFrequentElements(nums, k);
		System.out.println("first  " + k + " max elemets are " + Arrays.toString(sol));

	}

	private static Map<Integer, Integer> getFrequencyCount(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		return map;
	}

	

	private static int[] topKFrequentElements(int[] nums, int k1) {
		int sol[] = new int[k1];
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
				Map.Entry.comparingByValue(Comparator.reverseOrder()));
		Map<Integer, Integer> map = getFrequencyCount(nums);
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			pq.offer(it.next());
		}
		for (int i = 0; i < k1; i++) {
			sol[i] = pq.poll().getKey();
		}
		return sol;
	}

}
