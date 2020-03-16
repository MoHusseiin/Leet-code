package Arrays._49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public static void main(String[] args) {
		System.out.print(groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
	}
	
	/**
	 * Given an array of strings, group anagrams together.
	 * @param strs
	 * @return
	 */
	public static String[][] groupAnagrams(String[] strs) {
		if (strs.length == 0) return new String[][] {};
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String key =  new String(ch);
			if(!map.containsKey(key)) {
				List<String> list = new ArrayList<>();
				list.add(s);
				map.put(key, list);
			}else
				map.get(key).add(s);
		}
//		print(map);
		return convertMapToArray2D(map);
    }

	private static String[][] convertMapToArray2D(Map<String, List<String>> map) {
		String[][] result = new String[map.size()][];
		int k = 0;
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String[] temp = entry.getValue().stream().toArray(String[]::new);
			result[k++]= temp;
		}
		printArr(result);
		return result;
	}

	private static void printArr(String[][] result) {
		for (String[] x : result){
		   for (String y : x){
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}

	private static void print(Map<String, List<String>> map) {
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
	}
}
