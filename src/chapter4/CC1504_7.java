/**
 * 
 */
package chapter4;
import java.util.*;
/**
 * @author MaoTouMaoTou
 *
 */
public class CC1504_7 {
	private static Node root;
    private class Node(int n){
    	private Node left;
    	private Node right;
    	private Node parent;
		public int data;
		private int value;
		public Node(){
			this(0,null,null,null);
		}
public Node(int value,  Node left, Node right,Node parent){
	this(value,null,null,parent);
	this.value=value;
	this.left=left;
	this.right=right;
	this.parent=parent;
	}
boolean covers(Node root, Node p, Node q){
	if(root==null) return false;
	if(root==p) return true;
	if(root==q) return true;
return covers(root.left,p, q)|| covers(root.right,q, q);
}
 
Node AncestorFind(Node root,int[] p, int[] q){
	if(root==null) return null;
	if(root==p|| root==q) return root;
	
	boolean isponleft=covers(root.left,p,null);
	boolean isqonleft=covers(root.left,q,null);
	
	if(isponleft!=isqonleft) return root;
	
	Node childside=isponleft?root.left:root.right;
			return AncestorFind(childside,p,q);
			}
Node Ancestor(Node root, Node p, Node q){
	if(!covers(root,p,null)||!covers(root,q,null)){
		return null;
	}
return AncestorFind(root,p,q);
}
public static void main(String[] args){
	int[] p={ 7, 10, 4, 3, 1, 2, 8, 11};
	int[]  q={4, 10, 3, 1, 7, 11, 8, 2};
	
 int[] bt= covers(root, p,q);
 System.out.println(AncestorFind(root,p,q));
 
 
}	

}
