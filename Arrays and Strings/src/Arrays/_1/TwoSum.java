package Arrays._1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int delta = target - nums[i];
			if(map.containsKey(delta))
				return new int[] { map.get(delta), i };
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution"); 
	 }
	
	/**
	 * Given an array of integers, and a number ‘sum’, 
	 * Find the number of pairs of integers in the array whose sum is equal to ‘sum’.
	 * @param arr
	 * @param sum
	 * @return O(n^2)
	 */
	public int countPairsWithGivenSum(int arr[], int sum) {
		int count = 0; 
		int n = arr.length;
	    for (int i=0; i<n; i++) 
	        for (int j=i+1; j<n; j++) 
	            if (arr[i]+arr[j] == sum) 
	                count++; 
	  
	    return count; 
	}
}
