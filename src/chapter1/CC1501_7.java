/**
 * 
 */
package chapter1;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1501_7 {
	public static int[][] setZeros(int[] [] matrix){
		boolean[] row=new boolean[matrix.length];
		boolean[] column=new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){//find the element which is 0
					row[i]=true;//mark the row
					row[j]=true;//mark the row
				}
			}
				}
	for(int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[0].length;j++){
			if(row[i]||column[j]){//change the row and columm to 0
				matrix[i][j]=0;
		}
	}
	}
	return matrix;
	}
	public static void main(String[] args){
		int[][] matrix={{1,0,3},{1,1,1},{2,5,7}};
		matrix=setZeros(matrix);
		for(int i = 0; i < matrix.length; i++)
	    {
	        System.out.println();
	        for(int j = 0; j < matrix[0].length; j++)
	        {
	            System.out.print(matrix[i][j]+",");
	        }
	    }
	}
}
