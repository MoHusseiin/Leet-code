package Integers;

public class QuadraticEquation {
	
	public static double getPositiveRoot(double a, double b, double c) {
		double determinant = (b * b) - (4 * a * c);
	    double sqrt = Math.sqrt(determinant);
	    double root = 0;
	    if(determinant > 0) 
	    	root = (-b + sqrt)/(2 * a);
	    else if(determinant == 0)
	    	root = (-b)/(2 * a);
	    return Math.round(root);
	}
	
	public static double getMaxHeightStaircase(int n) {
		return getPositiveRoot(1, 1, (-2 * n));
	}
	public static void main(String args[]) {
	    System.out.println(getMaxHeightStaircase(12));
	}
}
