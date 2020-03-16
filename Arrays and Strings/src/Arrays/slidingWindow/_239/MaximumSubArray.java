package Arrays.slidingWindow._239;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MaximumSubArray {
	/**
	 * 
	 * @param nums
	 * @param k
	 * @return
	 * O(n * k)
	 */
	public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> maxSlidingWindow = new ArrayList<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
        	int max = 0;
        	for (int j = i; j < i + k; j++) {
				if(max < nums[j])
					max = nums[j];
			}
        	maxSlidingWindow.add(max);
		}
        System.out.println(maxSlidingWindow);
        return maxSlidingWindow.stream().mapToInt(i -> i).toArray();
   }
	
	/**
	 * 
	 * @param nums
	 * @param k
	 * @return
	 * O(n)
	 */
	public int[] maxSlidingWindowBest(int[] nums, int k) {
		if(nums == null || nums.length == 0 || k > nums.length) return nums;
        List<Integer> maxSlidingWindow = new ArrayList<>();
        List<Integer> temp = new LinkedList<>();
        for (int i = 0; i < k; i++) 
        	temp.add(nums[i]);
        maxSlidingWindow.add(Collections.max(temp));
        for (int end = k; end < nums.length; end++) {
        	temp.add(nums[end]);
        	temp.remove(0);
        	maxSlidingWindow.add(Collections.max(temp));
		}
        System.out.println(maxSlidingWindow);
        return maxSlidingWindow.stream().mapToInt(i -> i).toArray();
   }
}	
