package Arrays._16;

import java.util.Arrays;

public class ThreeSumClosest {
	
	/**
	 * Find if there is a triplet in array whose sum is equal to the given target value
	 * Each input would have exactly one solution.
	 * @param nums with no duplicate
	 * @param target
	 * @return the sum of the three integers such that the sum is closest to target
	 * O(n^2)
	 */
	public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length < 3) throw new IllegalArgumentException("Invalid input!");
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2]; 
        for (int i = 0; i < nums.length; i++) {
			int l = i + 1, r = nums.length - 1;
			while(l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if(Math.abs(sum - target) < Math.abs(closest - target))  // the difference between the distance between target and both sum & closest
					closest = sum;
				if(sum == target)
					return target;
				else if(sum < target)
					l++;
				else
					r--;
			}
		}
        return closest;
    }
}
