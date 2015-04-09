/**

 * 
 */
import java.util.*;
package chapter4;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1504_8 {
	private class Node{
		public int val;
		public Node left;
		public Node right;
		public Object data;
		Node(int n){
			val=n;
			left=null;
			right=null;
		}
	}
	class ListNode{
		public Object data;
		int val;
		ListNode next;
		ListNode(int i){
			val=i;
			next=null;
		}
		
public boolean containsSubtree(Node t1, Node t2){
	if(Node t2==null) return true;
	else{
		return isSubtree(t1,t2);
	}
	 boolean isSubtree(Node t1, Node t2){
    if(Node t1=null) return false;
	if(t1.data==t2.data){
		if(Match(t1,t2)){
			return true;
		}
		else{
			return isSubtree(t1.left, t2)||isSubtree(t1.right,t2);
			}
	}
	
 
	private boolean Match(Node t1, Node t2) {
		if(t2==null&&t1==null){
			return true;
		}
	if(t1==null||t2==null){
		return false;
	}
	if(t1.data!=t2.data){
		return false;
	}
	else{
		return Match(t1.left,t2.left)&&Match(t1.right,t2.right);
		
	}
		
 
		return false;
}
