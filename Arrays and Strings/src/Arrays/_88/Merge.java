package Arrays._88;

import java.util.stream.IntStream;

public class Merge {

	public int[] merge(int[] nums1, int m, int[] nums2, int n){
		if(nums1 == null || m == 0) return nums2;
		if(nums2 == null || n == 0) return nums1;
		int[] arr1 = nums1;
		int[] arr2 = nums2;
		nums1 = IntStream.range(0, m).map(i -> arr1[i]).toArray();
		nums2 = IntStream.range(0, n).map(i -> arr2[i]).toArray();
		int[] rerult = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < nums1.length && j < nums2.length) {
			if(nums1[i] <= nums2[j]) 
				rerult[k++] = nums1[i++];
			else
				rerult[k++] = nums2[j++];
		}
		if(i == m) 
			System.arraycopy(nums2, j, rerult, k, rerult.length - k);
		if(j == n) 
			System.arraycopy(nums1, i, rerult, k, rerult.length - k);
		return rerult;
//		return recursiveMerge(new int[m + n], 0, nums1, nums2);
	}

	private int[] recursiveMerge(int[] rerult, int index, int[] nums1, int[] nums2) {
		if(nums1.length == 0) {
			System.arraycopy(nums2, 0, rerult, index, nums2.length);
			return rerult;
		}
		
		if(nums2.length == 0) {
			System.arraycopy(nums1, 0, rerult, index, nums1.length);
			return rerult;
		}
		
		if(nums1[0] <= nums2[0]) {
			rerult[index] = nums1[0];
			return recursiveMerge(rerult, index + 1, removeElement(nums1, 0), nums2);
		}else {
			rerult[index] = nums2[0];
			return recursiveMerge(rerult, index + 1, nums1, removeElement(nums2, 0));
		}
	}

	 int[] removeElement(int[] arr, int index) {
		if (arr == null || index < 0 || index >= arr.length) return arr; 
		return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();
	}

}
