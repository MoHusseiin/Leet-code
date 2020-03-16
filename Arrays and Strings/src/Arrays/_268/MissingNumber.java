package Arrays._268;

import java.util.Arrays;

public class MissingNumber {

	/**
	 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
	 * find the one that is missing from the array.
	 * @param nums
	 * @return
	 */
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
//		make sure that the boundary of array are correct before 
		if(nums[nums.length - 1] != nums.length)
			return nums.length;
		else if(nums[0] != 0)
			return 0;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] - nums[i - 1] > 1)
				return nums[i - 1] + 1;
		}
		return -1;
    }
	
	public int missingNumberBest(int[] nums) {
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
