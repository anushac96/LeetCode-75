package maxNumberofKSumPairs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberofKSumPairs {

	public static void main(String[] args) {
		MaxNumberofKSumPairs p = new MaxNumberofKSumPairs();
		int nums[] = { 2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2 };
		int k = 3;

		// SC O(n) TC O(n)
		System.out.println(p.method1(nums, k));

		// SC O(nlogn) TC O(n)
		System.out.println(p.method2(nums, k));
	}

	public int method1(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(k - nums[i]) && map.get(k - nums[i]) >= 1) {
				count++;
				map.put(k - nums[i], map.get(k - nums[i]) - 1);
			} else {
				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			}
		}
		return count;
	}

	public int method2(int[] nums, int k) {
		Arrays.sort(nums);
		int count = 0;
		int i = 0;
		int j = nums.length - 1;
		while (i < j) {
			if (nums[i] + nums[j] == k) {
				count++;
				i++;
				j--;
			} else if (nums[i] + nums[j] > k) {
				j--;
			} else {
				i++;
			}
		}
		return count;
	}
}
