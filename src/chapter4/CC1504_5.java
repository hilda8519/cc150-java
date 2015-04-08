/**
 * 
 */
package chapter4;
import java.util.*;
/**
 * @author MaoTouMaoTou
 *
 */
public class CC1504_5 {
	private Node root;
    private class Node(int n){
    	private Node left;
    	private Node right;
		public int data;
		public Node insert(int i, Node t) {
			root=insert(n,root);
			
		}
    	
    }
    
public boolean ValidBST(Node n, int minValue, int maxValue){
	if(n==null){
		return true;
	}
		if(n.data<=minValue||n.data>maxValue){
			return false;
		}
if(ValidBST(n.left,minValue,n.data)) {
	return false;
}
if(ValidBST(n.right,n.data,maxValue)) {
	return false;
}
		return true;
}
 
public  static void main(String[] args){
	Node t = new Node(5);
	Node b = new Node(t);
	int[] a = {1,2,3,4,5};
	for(int i = 0;i<a.length;i++)
		b.insert(a[i],t);
	System.out.println(ValidBST(t,minValue,maxValue));
}
	
}
