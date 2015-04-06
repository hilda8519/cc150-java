/**
 * 
 */
package chapter4;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1504_3 {
	 class TreeNode{
			int val;
			TreeNode left;
			TreeNode right;
		
		 void TreeNode(int x){
			 val=x;
		 }
	}
		TreeNode minBST(int arr[], int start, int end){
			if(start<end){
				return null;
			}
		int middle=(start+end)/2;
		TreeNode n=new TreeNode(arr[middle]);
		n.left=minBST(arr, start, middle-1);
		n.right=minBST(arr,midlle+1,end);
		return n;
		}
	TreeNode miniBST(int array[]){
		return miniBST(array,0,array.length-1);
	}
}
