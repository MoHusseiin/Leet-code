package Arrays._15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	/**
	 * Find all unique triplets in the array which gives the sum of zero
	 * @param nums int[]
	 * @return 
	 * O(n^3)
	 */
	public List<List<Integer>> allThreeSumSort(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums == null || nums.length == 0) return result;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int l = i + 1, r = nums.length - 1;
			while (l < r) {
				if(nums[i] + nums[l] + nums[r] == 0) {
					result.add(Arrays.asList(nums[i], nums[l], nums[r]));
					while(l + 1 < nums.length && nums[l] == nums[l + 1]) 
						l++;
					while(r > l && nums[r] == nums[r - 1]) 
						r--;
				}if(nums[i] + nums[l] + nums[r] < 0)
					l++;
				else
					r--;
			}
			while(i + 1 < nums.length && nums[i] == nums[i + 1]) 
				i++;
		}
//		print(result);
		return result;
    }
	
//	private boolean contains(List<List<Integer>> result, List<Integer> two) {
//		for (List<Integer> one : result) {
//			if (one.containsAll(two)) return true;
//		}
//		return false;
//	}

	/**
	 * Find all unique triplets in the array which gives the sum of zero
	 * @param nums int[]
	 * @return 
	 * O(n^4)
	 */
	public List<List<Integer>> allThreeSum(int[] nums) {
		if(nums == null || nums.length < 3) throw new IllegalArgumentException("Invalid input!");
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if(nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> two = Arrays.asList(nums[i] , nums[j], nums[k]);
						boolean found = false;
						for (List<Integer> one : result) {
							if(one.containsAll(two)) {
								found = true;
								break;
							}
						}
						if(!found)
							result.add(two);
					}
						
				}
			}
		}
		print(result);
		return result;
    }
	
	private void print(List<List<Integer>> result) {
		for (List<Integer> list : result) {
			System.out.println(list);
		}
	}

	/**
	 * O(n^3)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] threeSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if(nums[i] + nums[j] + nums[k] == target)
						return new int[] {nums[i] , nums[j], nums[k]};
				}
			}
		}
		return new int[] {};
    }
	
	/**
	 * Find if there is a triplet in array whose sum is equal to the given target value
	 * each input would have exactly one solution.
	 * @param nums with no duplicate
	 * @param array of sum equal target 
	 * @return 
	 * O(n^2)
	 */
	public int[] threeSumTarget(int[] nums, int target) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int l = i + 1, r = nums.length - 1;
			while(l < r) {
				if(nums[i] + nums[l] + nums[r] == target)
					return new int[] {nums[i] , nums[l], nums[r]};
				else if(nums[i] + nums[l] + nums[r] < target)
					l++;
				else
					r--;
			}
		}
		return new int[] {};
    }
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); 
		  
        // Use add() method to add elements 
        // into the List 
        list.add(-1); 
        list.add(0); 
        list.add(1); 
//        list.add(20); 
//        list.add(5); 
//  
        // Displaying the List 
//        System.out.println("List: " + list); 
  
        // Creating another empty List 
        List<Integer> listTemp = new ArrayList<Integer>(); 
  
        listTemp.add(0); 
        listTemp.add(1); 
        listTemp.add(-1); 
  
        System.out.println("Are all the contents equal? "
                           + list.containsAll(listTemp)); 
	}
}
