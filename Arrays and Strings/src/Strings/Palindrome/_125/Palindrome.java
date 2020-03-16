package Strings.Palindrome._125;

public class Palindrome {
	
	public static boolean isPalindrome(String s) {
        int law = 0, high = s.length() - 1;
        while(law < high) {
        	if(Character.isLetterOrDigit(s.charAt(law)) && Character.isLetterOrDigit(s.charAt(high))) {
        		if (Character.toLowerCase(s.charAt(law)) != Character.toLowerCase(s.charAt(high)))
        			return false;
        		law++;
            	high--;
        	}else{
	        	if(!Character.isLetterOrDigit(s.charAt(law)))
	    			law++;
	        	if(!Character.isLetterOrDigit(s.charAt(high)))
	    			high--;
	        }
        }
        return true;
    }
	

	/**
	 * Determine whether an integer is a palindrome. 
	 * An integer is a palindrome when it reads the same backward as forward.
	 * @param x
	 * @return 121
	 */
	public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int backward = 0, temp = x;
        while (x != 0) {
        	int firstDigit = x % 10;
        	backward = (backward * 10) + firstDigit;
        	x /= 10;
		}
        return temp == backward;
    }	
}
