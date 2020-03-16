package Strings._387;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UniqeCharacter {

	public static void main(String[] args) {
//		System.out.println(isUniqeCharachter("leetcode"));
//		System.out.println(isUniqeCharachter("shika"));
//		System.out.println(isUniqeCharachter("loveleetcode"));
//		System.out.println();
//		System.out.println(isUniqeCharachterWithoutDS("leetcode"));
//		System.out.println(isUniqeCharachterWithoutDS("shika"));
//		System.out.println(isUniqeCharachterWithoutDS("loveleetcode"));
//		System.out.println();
//		System.out.println(firstUniqChar("leetcode"));    //  0
//		System.out.println(firstUniqChar("shika"));       //  0
//		System.out.println(firstUniqChar("loveleetcode"));  // 2
//		System.out.println(firstUniqChar("")); 
//		System.out.println(firstUniqChar(null)); 
//		System.out.println();
//		char [] cha = new char[2];
//		cha[0]++;
//		System.out.println(Arrays.toString(cha));
	}

	/**
	 * Suppose we send ASCII String not Unicode 
	 * @param string
	 * @return true if this string contains only unique characters, otherwise false
	 * T(n) = O(n) : n str.length()
	 * S(n) = O(1)
	 */
	private static boolean isUniqeCharachter(String str) {
		if(str.length() > 128) return false;       // 128 is the maximum ASCII character alphabet
		boolean[] charArr = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			if(charArr[ascii]) 
				return false;
			else
				charArr[ascii] = true;
		}
		return true;
	}
	
	/**
	 * Suppose we send ASCII String not Unicode 
	 * @param string
	 * @return true if this string contains only unique characters, otherwise false
	 * T(n) = O(n^2) : n str.length()
	 * S(n) = 0
	 */
	private static boolean isUniqeCharachterWithoutDS(String str) {
		if(str.length() > 128) return false;       // 128 is the maximum ASCII character alphabet
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if(ch == str.charAt(j)) return false;
			}			
		}
		return true;
	}
	
	/**
	 * find the first non-repeating character in it and return it's index
	 * @param s
	 * @return index of first unrepeated index If it doesn't exist, return -1.
	 * T(n) = O(n)
	 * S(n) = n
	 */
	private static int firstUniqChar(String s) {
		if(s == null) return -1;
		char[] count = new char[128];
		for (int i = 0; i < s.length(); i++) 
			count[s.charAt(i)]++;
//		int index = -1;
//		for (int i = 0; i < s.length(); i++) {
//			if(count[s.charAt(i)] == 1) {
//				index = i;
//				break;
//			}
//		}
//		return index;

		return IntStream.range(0, s.length()).filter(i -> (count[s.charAt(i)] == 1)).findFirst().orElse(-1);
	}
}
