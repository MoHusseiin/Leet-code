package Strings.Palindrome;

public class PermutationPalindrome {

	/**
	 * 
	 * @param phrase
	 * @return
	 */
	public boolean isPermutationOfPalindrome(String phrase) {
		int[] table = new int[128];
		int oddCount = 0;
		for (int i = 0; i < phrase.length(); i++) {
			int ch = phrase.charAt(i);
			if(Character.isLetter(ch)) {
				table[ch]++;
				if(table[ch] % 2 == 1)   // odd num
					oddCount++;
				else
					oddCount--;
			}
		}
		return oddCount < 2;
	}
}
