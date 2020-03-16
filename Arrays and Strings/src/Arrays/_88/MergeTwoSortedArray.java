package Arrays._88;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
//		int[] arr1 = {1,3,5,7,9,11,13};
//		int[] arr1 = {-1,0,0,3,3,3,0,0,0};
		int[] arr1 = {1,2,3,0,0,0};
//		int[] arr2 = {1,3,5,7,9,11,13};
//		int[] arr2 = {2,4,6,8,10,12,14,16,18,20};
//		int[] arr2 = {2,5,6,0,0,0};
		int[] arr2 = {2,5,6};
//		int[] arr1 = {1,2,3};
//		int[] arr2 = {0,0,0,2,5,6};
//		int[] result = Arrays.stream(arr2).filter(i -> i != 0).toArray();
		Merge m = new Merge();
		int[] result = m.merge(arr1, 3, arr2, 3);
//		int[] result = m.removeElement(arr1, 0);
		System.out.println(Arrays.toString(result));
	}

}
