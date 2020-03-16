package Arrays._48;

public class RotateImage {
	
	/**
	 * Rotate the image in-place by 90 degrees (clockwise).
	 * @param 2D matrix
	 * 
	 */
	public void rotate(int[][] matrix) {
		int length = matrix.length;
		if(matrix == null || length == 0 || length != matrix[0].length) return;
		for (int i = 0; i < length / 2; i++) {
			int start = i, end = length - i - 1;
			for (int j = start; j < end; j++) {       // problem in last iteration because of bottom when j == end - 1
				int temp = matrix[start][j];          // save top into temp
				matrix[start][j] = matrix[length - 1 - j][start];  // top <- left
				matrix[length - 1 - j][start] = matrix[end][length - 1 - j];    // left <- bottom
				matrix[end][length - 1 - j] = matrix[j][end];      // bottom <- right
				matrix[j][end] = temp;                // right <- temp
			}
		}
		printMatrix(matrix);
    }
	
	void printMatrix(int arr[][]) { 
		int N = arr.length;
	    for (int i = 0; i < N; i++) { 
	        for (int j = 0; j < N; j++) 
	        System.out.print( arr[i][j] + " "); 
	        System.out.println(); 
	    } 
	} 
}
