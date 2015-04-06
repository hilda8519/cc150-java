/**
 * 
 */
package chapter4;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1504_1 {
	private TreeNode root;
	provate class Node{
	 int data;
	 Node *left,*right;
	}
	
public static int getHeight(TreeNode Root){
	if(root==null){
		return 0;
	}
	else{
		return Math.max(getHeight(root.left),getHeight(root,right))+1;
	}
 
	public static boolean isBalanced(TreeNode root){
		if(root==null){
			return true;
		}
	int heightDifferent=getHeight(root.left)-getHeight(root.right);
	if(Math.abs(heightDifferent)>1){
		return false;
	}
	else{
		return isBalanced(root.left)&&isBalanced(root.right);
	}
	}
 
 
}
}
