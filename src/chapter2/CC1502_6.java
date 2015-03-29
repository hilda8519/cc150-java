/**
 * 
 */
package chapter2;
import java.awt.List;
import java.util.*;
/**
 * @author MaoTouMaoTou
 *
 */
public class CC1502_6 {
	public static ListNode findBeginning(ListNode head){
		ListNode slow=head;
		ListNode fast=head;
 
    while(fast!=null&&fast.next!=null){
    	slow=slow.next;
    	fast=fast.next.next;
    	if(slow==fast){
    		break;
    	}
    }
	if(fast==null|| fast.next==null){
		return null;
	}
	slow=head;
	while(slow!=fast){
		slow=slow.next;
		fast=fast.next;
	}
	return fast;
	}
	class ListNode{
		public Object data;
		int val;
		ListNode next;
		ListNode(int i){
			val=i;
			next=null;
		}
}
	 public static void main(String[] args) {
		 
	        //{1-2-3-4-5-3}
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);
	        head.next.next.next.next.next = head.next.next;
	        //expect 3
	        System.out.println(findBeginning(head));
	    }

}
