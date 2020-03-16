package Arrays.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Immutable {

	public static void main(String[] args) {
		final Integer[] immutableArray = new Integer[] {0, 1, 2, 3};
//		immutableArray = new Integer[] {5 , 9}; // The final local variable array cannot be assigned
		immutableArray[0] = 10;
		System.out.println(Arrays.toString(immutableArray));
		
		final int[] mutableArray = new int[] {0, 1, 2, 3};
//		mutableArray = new Integer[] {10, 20};   // The final local variable array cannot be assigned
		mutableArray[0] = 30;
		System.out.println(Arrays.toString(mutableArray));
		
		final String[] strArray = new String[] {"shika", "Mohamed"};
//		strArray = new String[] {"MO"};   // The final local variable array cannot be assigned
		strArray[0] = "Abdeen";
		System.out.println(Arrays.toString(strArray));
		
		List<Integer> immutableList = new ArrayList<>();
		immutableList.add(2);
		immutableList.set(0, 5);
		System.out.println(immutableList);
		
		Integer age = 5;
		age = 6;
		age = new Integer(4);
		System.out.println(age);
		
		List<String> list = new ArrayList<String>(Arrays.asList("one", "two", "three"));
	    List<String> unmodifiableList = Collections.unmodifiableList(list);
//	    unmodifiableList.add("four");   // Arithmatic Exeption
	    System.out.println(list);
	    System.out.println(unmodifiableList);
	   
	    System.out.println(999999999/0);
	}
	

}
