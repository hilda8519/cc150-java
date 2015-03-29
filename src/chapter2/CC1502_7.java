/**
 * 
 */
package chapter2;
import java.util.Stack;
/**
 * @author MaoTouMaoTou
 *
 */
public class CC1502_7 {
	public static boolean isPalindrome(ListNode head){
		ListNode fast=head;
		ListNode slow=head;
	
	Stack<Integer> stack=new Stack<Integer>();
	while(fast!=null&&fast.next!=null){
		stack.push(slow.data);
		slow=slow.next;
		fast=fast.next.next;
	}
	if(fast!=null){
		slow=slow.next;
	}
	while(slow!=null){
		int top=stack.pop().intValue();
	    if(top!=slow.data){
	    	return false;
	    }
	slow=slow.next;
	}
	return false;
	}
	
	class ListNode{
		public Object data;
		int val;
		ListNode next;
		ListNode(int i){
			val=i;
			next=null;
		}
 
		
		public static void main (String[] args){
			String s="MON";
		System.out.println(isPalindrome(s));
		}
}
}
