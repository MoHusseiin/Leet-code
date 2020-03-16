package Integers;

public class MaximumDigitSum {
	
	public int maximumDigitSum(long max) {
		int ans = 0;
		while(max != 0) {
			int cur = (int) max;
			if(sumDigits(cur) > sumDigits(ans))
				ans = cur;
			max--;
		}
		return ans;
	}

	private int sumDigits(long num) {
		 int sum = 0;
		 long temp = num;
		 if(num < 0) {
			temp = num;
			num *= -1; 
		 }
		 while (num != 0) {
			if(String.valueOf(num).length() == 1 && temp < 0) {  
				num *= -1;
				sum += num;
		 	}else 
				sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
