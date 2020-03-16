package Arrays._912;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
	
	public List<Integer> sortArray(int[] nums) {
       Arrays.sort(nums);
       return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
	
	
	/**
	 * Sort an array in wave form
	 * @param nums
	 * @return
	 */
	public int[] sortArrayInWaveForm(int[] nums) {
       if(nums.length < 2) return nums; 
       Arrays.sort(nums);	
       for (int i = 0; i < nums.length - 1; i+=2) {
    	   int temp = nums[i];
    	   nums[i] = nums[i + 1];
    	   nums[i + 1] = temp;
       }
       return nums;
    }
	
	/**
	 * Sort an array in wave form
	 * @param nums
	 * @return
	 */
	public int[] sortArrayInWaveFormBest(int[] nums) {
       if(nums.length < 2) return nums;	
       for (int i = 0; i < nums.length - 1; i+=2) {
    	   if(nums[i] < nums[i + 1]) {
	    	   int temp = nums[i];
	    	   nums[i] = nums[i + 1];
	    	   nums[i + 1] = temp;
    	   }
       }
       return nums;
    }
}