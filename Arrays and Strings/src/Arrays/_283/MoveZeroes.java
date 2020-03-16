package Arrays._283;

import java.util.Arrays;

public class MoveZeroes {

	/**
	 * Given an array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	 * You must do this in-place without making a copy of the array.
	 * @param nums
	 */
	public void moveZeroes(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
			if(nums[left] == 0) {
				int i = left + 1;
				for ( ; i < right; i++) {
					nums[i - 1] = nums[i];
				}
				int temp = nums[right];
				nums[i - 1] = temp;
				nums[right] = 0;
				right--;
			}
			left++;
		}
        System.out.println(Arrays.toString(nums));
    }
	
	public void moveZeroes2(int[] nums) {
        int cur = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0)
				nums[cur++] = nums[i];
		}
        for (int i = cur; i < nums.length; i++) 
        	nums[i] = 0;
        System.out.println(Arrays.toString(nums));
    }
}
