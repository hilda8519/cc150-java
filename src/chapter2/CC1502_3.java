/**
 * 
 */
package chapter2;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1502_3 {
	private static final ListNode l6 = null;
	 
	public static boolean deleteNode(ListNode n){
	if(n==null||n.next==null){
		return false;
	}
			ListNode next=n.next;
	        n.data=next.data;
	        n.next=next.next;
	        return true;
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
	 
	 
	 
		public static void main(String[] args){
			ListNode l1 = new ListNode(1);
			ListNode l2 = new ListNode(2);
			ListNode l3 = new ListNode(3);
			ListNode l4 = new ListNode(4);
			ListNode l5 = new ListNode(5);
			
			l1.next = l2;
			l2.next = l3;
			l3.next = l4;
			l4.next = l5;
			l5.next = l6;
		
			while (l1 != null) {
				System.out.print(l1.val + " ");
				l1 = l1.next;
		}
	}

}
