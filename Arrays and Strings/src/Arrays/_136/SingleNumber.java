package Arrays._136;

import java.util.Arrays;

public class SingleNumber {

	/**
	 * Given a non-empty array of integers, 
	 * every element appears twice except for one. 
	 * Find that single one
	 * @param nums
	 * @return the single one
	 */
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i+=2) {
			if(nums[i] != nums[i + 1])
				return nums[i];
		}
		return nums[nums.length - 1];
    }
	
	public int singleNumber2(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
    }
}
