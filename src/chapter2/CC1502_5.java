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
public class CC1502_5 {
	public ListNode addLists(ListNode l1, ListNode l2,int carry ){
		if(l1==null&&l2==null&&carry==0){/*if l1=l2=null, return null*/
			return null;
		}
	ListNode result=new ListNode(carry, null,null);
	int value=carry;
	if(l1!=null){
		value+=l1.data;
	}
	if(l2!=null){
		value+=l2.data;
	}
	result.data=value%10;
	
	if(l1!=null||l2!=null){
		ListNode more=addList(l1==null?null:l1.next, l2==null?null:l2.next,value>=10?1:0);
		result.setNext(more);
	}
return result;
	
 class ListNode{
		public Object data;
		int val;
		ListNode next;
		ListNode(int i){
			val=i;
			next=null;
		}
 
public void main(String[] args){
	ListnNode<Integer> l1=new ListNode<Integer>({1,9,8});
	ListNode<Integer> l2=new ListNode<Integer>({9,7,3});
    System.out.println("l1");
    System.out.println("l2");
	System.out.println("addLists(l1,l2)");
 
}
	}
}
}
