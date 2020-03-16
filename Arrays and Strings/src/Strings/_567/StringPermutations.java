package Strings._567;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPermutations {
	
	static List<String> allPerm = new ArrayList();
	
	public static void main(String[] args) {
//		System.out.println(sort("eidboaoo"));
//		System.out.println(isPermutationList("shika", "kasih"));
//		System.out.println(isPermutation("shika", "kasih"));
//		System.out.println(isPermutationList("shika ", "ksihn"));
//		System.out.println(isPermutation("shika", "kaihm "));
//		System.out.println(checkInclusion("ab", "eidbaooo"));
//		System.out.println(checkInclusion("ab", "eidboaoo"));
//		System.out.println("iPhone".contains("ho"));
		getAllPermutn("abc", "");
		System.out.println(allPerm);
	}
	

	/**
	 * Given two strings s1 and s2, write a function to return true if 
	 * s2 contains the permutation of s1. In other words, 
	 * one of the first string's permutations is the substring of the second string.
	 * @param s1
	 * @param s2
	 * @return
	 * T(n) = O(n!)
	 * S(n) = s(n^2)
	 */
//	public static boolean checkInclusion(String s1, String s2) {
//        getAllPermutn(s1, "");
//        for (String per : allPerm) {
//			if(s2.contains(per)) return true;
//		}
//        return false;
//    }
	
	public static boolean checkInclusion(String s1, String s2) {
        s1 = sort(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
			String sub = s2.substring(i, i + s1.length());
			if(s1.equals(sort(sub))) return true;
		}
        return false;
    }
	
	private static void getAllPermutn(String str, String ans) {
		if (str.length() == 0) { 
			allPerm.add(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); 
			String rest = str.substring(0, i) + str.substring(i + 1);
			getAllPermutn(rest, ans + ch);
		}
	}

	/**
	 * (case sensitive) Decide if s is a permutation of t
	 * @param s
	 * @param t
	 * @return true if s is a permutation of t, false otherwise
	 */
	static boolean isPermutation(String s, String t) {
		if (s.length() != t.length()) // Should be the same length
			return false;
		return sort(s).equals(sort(t)); 
	}

	static boolean isPermutationList(String s, String t) {
		if (s.length() != t.length()) // Should be the same length
			return false;
		List<Character> chars = s.chars().mapToObj(e -> (char)e) .collect(Collectors.toList());
		for (int i = 0; i < t.length(); i++) {
			if(!chars.contains(t.charAt(i)))
				return false;
		}
		return true;
	}
	
	private static String sort(String str) {
		char[] content= str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	} 
}
