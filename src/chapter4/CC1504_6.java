/**
 * 
 */
package chapter4;
import java.util.*;
/**
 * @author MaoTouMaoTou
 *
 */
public class CC1504_6 {
	private Node root;
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
 
    public Node isSuccessor(int[] t){
    	int m;
    	int l;
    
    	if(t==null) return null;
    	if(t.right!=null){
    		return leftChild(t.right);
    		}
    	else{
    		Node m=t;
    		Node l=m.parent;
    	}
    	
		while(l.right!=null&& l.left!=m){
    		m=l;
    		l=l.parent;
    	}
    return l;
    }
 
 
public Node leftChild(Node n){
	if(n==null){
		return null;
	}
while(n.left!=null){
	n=n.left;
}
return n;
}
public static void main(String[] args){
	
	int[] t ={1,2,3,4,5};
	System.out.println(isSuccessor(t));
	
	
}
}
