package Strings._7;

public class ReverseInteger {
	/**
	 * Given a 32-bit signed integer, reverse digits of an integer.
	 * @param x
	 * @return reversed integer 0 if out of boundary 
	 */
	 public int reverse(int x) {
        long reversed = 0, temp = x;
		if (x < 0) 
			 temp *= -1;
		// 5431
		while (temp != 0) {
			int lastDigit = (int) (temp % 10);
			reversed = (reversed * 10) + lastDigit ;
			temp /= 10;
			if(reversed >= Integer.MAX_VALUE) return 0;
		}
		reversed = (x < 0) ? (reversed * -1) : reversed;
		return (int)reversed;
    }
}
