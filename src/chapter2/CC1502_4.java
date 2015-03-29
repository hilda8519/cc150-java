/**
 * 
 */
package chapter2;
import java.util.List;
/**
 * @author MaoTouMaoTou
 *
 */
public class CC1502_4 {
	public static void  ListPartition(ListNode node, int x){
		ListNode beforeStart=null;
		ListNode afterStart=null;
		
		while (node!=null){
			ListNode next=node.next;
			if(node.val<x){
				node.next=beforeStart;
				beforeStart=node;
			}
			else{
				node.next=afterStart;
				afterStart=node;
			}
			node=next;
		}
	if(beforeStart==null){
		return;
	}
	ListNode head=beforeStart;
	while(beforeStart.next!=null){
		beforeStart=beforeStart.next;
	}
	beforeStart.next=afterStart;
	return;
	
	}
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x, int i, int j, int k, int l, int m, int n, int o, int p, int q) {
	        val = x;
	        next = null;
	    }
	}
public static void main(String[] args){
	ListNode ListNode  = new ListNode(1,2,3,4,5,7,8,9,10,11 );
	
		System.out.println(ListPartition(ListNode, 10));
		
	
}
}
