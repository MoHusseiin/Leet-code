package Integers.ugly._263;

public class UglyNumber {
	 
	/**
	 * check whether a given number is an ugly number.
	 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * @param num
	 * @return
	 */
	public boolean isUgly(int num) {
		if(num == 0 || num <= Integer.MIN_VALUE || num >= Integer.MAX_VALUE) return false;
		int factors[] = {2, 3, 5};
		for (int factor : factors) {
			while (num % factor == 0)
				num /= factor;
		}
		return (num == 1 || num == -1);
	}
}
