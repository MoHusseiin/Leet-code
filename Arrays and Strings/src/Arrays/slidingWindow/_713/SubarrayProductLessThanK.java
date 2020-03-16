package Arrays.slidingWindow._713;

public class SubarrayProductLessThanK {
	
	/**
	 * Count and print the number of contiguous subarrays where the product 
	 * of all the elements in the subarray is less than k.
	 * @param nums
	 * @param k
	 * @return number of count
	 */
	// sliding window moving the window by one position to the right
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		if(k <= 1) return 0;
		int count = 0, product = 1;
		for (int right = 0, left = 0; right < nums.length; right++) {
			product *= nums[right];
			while(left < right && product >= k) {
				product /= nums[left]; 
				left++;
			}
			count += right - left + 1; 
		}
		return count;
    }
}
