package Strings._443;

public class StringCompression {
     
	/**
	 * Given an array of characters, compress it in-place. 
	 * The length after compression must always be smaller than or equal to the original array.
	 * Every element of the array should be a character (not int) of length 1.
	 * @param chars
	 * @return the new length of the array.
	 */
	public int compressInPlace(char[] chars) {
		int count = 0, newCount = 0;
        for (int i = 0, j = i + 1; i < chars.length; i++) {
			if(j == chars.length || chars[i] != chars[j]) {
				chars[newCount++] = chars[count];
				if(i > count) {
					for(char ch : ( "" + ((i - count) + 1)).toCharArray()) 
						chars[newCount++] = ch;
				}
				count = i + 1;
			}
			j++;
		}
//        chars[newCount] = '\0';
//        System.out.println(chars);
        return newCount;
    }
	
	public int compressCount(char[] chars) {
		int compressedlength = 0, countConsecutive = 0;
		for (int i = 0; i < chars.length ; i++) {
			countConsecutive++;
			char ch = chars[i];
			if(i + 1 >= chars.length || ch != chars[i + 1]) {
				compressedlength += String.valueOf(countConsecutive).length() + 1;   // prevLength + char + (number of digits in countConsecutive) 
				countConsecutive = 0;
			}
		}
		return compressedlength;
    }
	
	public String compress(String str) {
		int count = 0, i = 0;
		StringBuilder stringBuilder = new StringBuilder();
		for (int j = i + 1; i < str.length() && j < str.length(); i++, j++) {
			count++;
			char ch = str.charAt(i);
			if(j >= str.length() || ch != str.charAt(j)) {
				stringBuilder.append(ch);
				stringBuilder.append(count);
				count = 0;
			}
		}
		if(count > 1) {
			stringBuilder.append(str.charAt(i));
			stringBuilder.append(count);
		} 
		return (stringBuilder.length() < str.length()) ? stringBuilder.toString() : str;
    }
}
