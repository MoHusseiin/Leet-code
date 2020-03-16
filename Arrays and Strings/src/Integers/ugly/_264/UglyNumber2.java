package Integers.ugly._264;

public class UglyNumber2 {
	
	/**
	 * find the n-th ugly number.
	 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5
	 * @param n
	 * @return
	 */
	public int nthUglyNumber(int n) {
        int[] allUgly = new int[n];
        allUgly[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
        	int factor2 = allUgly[i2] * 2;
        	int factor3 = allUgly[i3] * 3;
        	int factor5 = allUgly[i5] * 5;
			int min = Math.min(factor2, Math.min(factor3, factor5));
			allUgly[i] = min;
			if(factor2 == min)
				i2++;
			if(factor3 == min)
				i3++;
			if(factor5 == min)
				i5++;
		}
        return allUgly[n - 1];
    }
}
