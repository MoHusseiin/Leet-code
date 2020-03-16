package Integers._887;

public class SuperEggDrop {
	
	/**
	 * You are given K eggs, and you have access to a building with N floors from 1 to N
	 * What is the minimum number of moves that you need to know with certainty what F is, regardless of the initial value of F?
	 * @param K
	 * @param N
	 * @return
	 */
	public int superEggDrop(int K, int N) {
		if(N == 0 || N == 1)
			return N;
		if(K == 1) // If i have one egg so min number of trails needed are floors number
			return N;
		int f = Integer.MAX_VALUE;
		for (int x = 1; x <= N; x++) {
			int res = Math.max(superEggDrop(K - 1, x - 1), superEggDrop(K, N - x));
			if(res < f)
				f = res;
		}
		return f + 1;
    }
	
	  public int superEggDropBest(int K, int N) {
	        int lo = 1, hi = N;
	        while (lo < hi) {
	            int mi = (lo + hi) / 2;
	            if (numOfEggAtX(mi, K, N) < N)
	                lo = mi + 1;
	            else
	                hi = mi;
	        }
	        return lo;
	    }

	    private int numOfEggAtX(int x, int K, int N) {
	        int ans = 0, r = 1;
	        for (int i = 1; i <= K; ++i) {
	            r *= x - i + 1;
	            r /= i;
	            ans += r;
	            if (ans >= N) break;
	        }
	        return ans;
	    }
}