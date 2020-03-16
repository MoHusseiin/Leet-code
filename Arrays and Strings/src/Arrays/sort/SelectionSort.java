package Arrays.sort;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SelectionSort {
	private static int arr[] = {5, 9, 1, 6};
	
	public static void main(String[] args) {
//		System.out.println(Arrays.toString(auxiliaryArraySort(new int[arr.length], 0)));
//		selectionSort();
//		sortStream();
//		sortArrays();
//		System.out.println(Arrays.toString(arr));
		Class cls = Calculate.class;  
        // Getting declared methods inside the Calculate class  
        Method[] method = cls.getDeclaredMethods(); // It returns array of methods  
        // Iterating method array  
        for (Method method2 : method) {  
            System.out.print(method2.getName());    // getting name of method  
            // Getting parameters of each method  
            Parameter parameter[] = method2.getParameters(); // It returns array of parameters  
            // Iterating parameter array  
            for (Parameter parameter2 : parameter) {  
                System.out.print(" "+parameter2.getParameterizedType()); // returns type of parameter  
                System.out.print(" "+parameter2.getName()); // returns parameter name  
            }  
            System.out.println();  
        }  
	}

	private static int [] auxiliaryArraySort(int []uxiliaryArray, int index) {
		if(arr == null || arr.length < 1) return uxiliaryArray;
		int min = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[min]) min = i;
		}
		uxiliaryArray[index] = arr[min];
		arr = removeElement(min);
		return auxiliaryArraySort(uxiliaryArray, index + 1);
	}

	private static int[] removeElement(int min) {
		return Arrays.stream(arr).filter( i -> i != arr[min]).toArray();
	}

	private static void sortArrays() {
		Arrays.sort(arr);  // Dual-Pivot Quicksort O(nlog(n)) JDK6 O(n) JDK7
	}

	private static void sortStream() {  // sorted() in itself is O(1) it delegates to Arrays.sort() so O(nlog(n))
		arr = Arrays.stream(arr).sorted().toArray();
	}

	private static void selectionSort() {  // O(n^2)) 
		if(arr == null || arr.length < 2) return;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int minPos = i;
			for (int j = i; j < length; j++) {
				if(arr[j] < arr[i]) 
					minPos = j;
			}
			swap(i, minPos);
		}
	}

	private static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
}
