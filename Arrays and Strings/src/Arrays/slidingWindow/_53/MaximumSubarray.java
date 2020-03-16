package Arrays.slidingWindow._53;

public class MaximumSubarray {
	
	/**
	 * find the contiguous subarray (containing at least one number) 
	 * which has the largest sum
	 * @param nums
	 * @return sum
	 * dynamic programming
	 */
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
        int max = nums[0], sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum = Math.max(nums[i], sum + nums[i]);
			max = Math.max(max, sum);
		}
		return max;
    }
	
	
	/**
	 * find the maximum sum of any contiguous subarray of size k
	 * @param nums
	 * @return max sum
	 * Sliding Window
	 */
	public int getMaxSumSubArrOfSizeK(int[] nums, int k) {
		if(nums == null || nums.length == 0 || k > nums.length) return -1;
        int sum = 0, max = 0;
        for (int i = 0; i < k; i++) 
        	sum += nums[i];
		for (int end = k; end < nums.length; end++) {
			sum += nums[end] - nums[end - k];
			max = Math.max(max, sum);
		}
		return max;
    }
	
	
}
