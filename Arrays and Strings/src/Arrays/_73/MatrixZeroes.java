package Arrays._73;

public class MatrixZeroes {
	
	/**
	 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place
	 * @param matrix
	 */
	public void setZeroes(int[][] matrix) {
		int MODIFIED = -1000000;
        for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					for (int k = 0; k < matrix[0].length; k++) {
						if(matrix[i][k] != 0)
							matrix[i][k] = MODIFIED;
					}
					for (int k = 0; k < matrix.length; k++) {
						if(matrix[k][j] != 0)
							matrix[k][j] = MODIFIED;
					}
				}
			}
		}
        for (int i = 0; i < matrix.length; i++) { 
	        for (int j = 0; j < matrix[i].length; j++) {
	        	if(matrix[i][j] == MODIFIED)
	        		matrix[i][j] = 0;
	        } 
	    } 
        print(matrix);
    }

	private void print(int[][] arr) {
	    for (int i = 0; i < arr.length; i++) { 
	        for (int j = 0; j < arr[i].length; j++) 
	        System.out.print( arr[i][j] + " "); 
	        System.out.println(); 
	    } 
	}
}
