package Strings._796;

public class RotateString {
	
	/**
	 * A shift on A consists of taking string A and moving 
	 * the leftmost character to the rightmost position.
	 * @param A
	 * @param B
	 * @return True if and only if A can become B after some number of shifts on A.
	 */
	public boolean rotateString(String A, String B) {
		if (A.length() != B.length())
            return false;
        if (A.length() == 0)
            return true;
		if(A.length() > 100 || B.length() > 100) return false;
		else return rotateString(A, B, A.length());
    }

	private boolean rotateString(String A, String B, int length) {
		if(A.equals(B))
        	return true;
		else if(length == 0)
			return false;
        else {
        	char temp = A.charAt(0);
        	StringBuilder sb = new StringBuilder();
        	for (int i = 1; i < A.length(); i++) {
        		sb.append(A.charAt(i));
			}
        	sb.append(temp);
        	return true & rotateString(sb.toString(), B, length - 1);
        }
	}
	
	public boolean rotateStringSimple(String A, String B) {
		return (A.length() == B.length()) && (A + A).contains(B);
    }
}
