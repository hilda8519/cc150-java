
package chapter1;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1501_6 {
	public static void rotateMat(int[][] matrix){
		int n = matrix.length;//n*n matrix
		for(int layer = 0;layer<n/2;layer++){//we only need to move  n/2 layer
			int first = layer;
			int last = n-1-layer;
			for(int i = first; i< last; i++){//from the outest layer in the matrix
				int offset = i-first; //this is the offest between each layer
				
				int top = matrix[first][i];//save top
				
				matrix[first][i] = matrix[last-offset][first];//left to top
				matrix[last-offset][first] = matrix[last][last-offset];//bottom to left
				matrix[last][last-offset] = matrix[i][last];//right to bottom
				matrix[i][last] = top;//top to right
			}
	        }
	public static void main(String[] args){
		int[][]matrix1 = {{1,2},{3,4},{5,6},{7,8}};
		int[][]matrix2 = rotateMat(matrix1);
		System.out.println(matrix1);
		System.out.println(matrix2);
}
}
