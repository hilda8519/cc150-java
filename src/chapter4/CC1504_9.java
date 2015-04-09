/**
 * 
 */
import java.util.*;
package chapter4;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1504_9 {
	private class Node{
		public int val;
		public Node left;
		public Node right;
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
public void CheckSum(Node node, int sum,int[] path, int level){
	if(node==null){
		return;
	}
	path[level]=node.data;
	int n=0;
	for(int i=level;i>=0;i--){
		n=path[i]++;
		if(n==sum){
			println(path,i,level);
		}
		}
	Find(node.left,sum,path,level+1);
	Find(node.right,sum,path,level+1);
	
	path[level]=Integer.MIN_VALUE;
	}
public void Find(Node node, int sum,int path, int level){
	int depth=depth(node);
    int[] path=new int[depth];
    Find(node, sum,path,0);
}
	
public int depth(Node node){
	if(node==null){
		return 0;
	}
	else{
		return 1+Math.max(depth(node.left),depth(node.right));
	}
}
}

}
