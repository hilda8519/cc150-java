/**
 * 
 */
package chapter2;

import java.util.LinkedList;

public class CC1502_1 {
public static void deleteDuplicates(LinkedList head){
	if (head == null)
		return;

     LinkedList current = head;
     if(current != null)
     {
    	 LinkedList runner = current;
    	 if( runner.next.data == current.next.data){
    		 runner.next = runner.next.next;
    	 }
    	 else{
    		 runner = runner.next;
    	 }
     }
             current = current.next;
}
	
	public static void main(String[] args) {
		LinkedList first = new LinkedList();
		LinkedList head = first;
		LinkedList second = first;
		for(int i=1; i<8; i++) {
			second = new LinkedList(i%2, null, null);
			((Object) first).setNext(second);
			second.setPrevious(first);
			first = second;
		}
			System.out.println(((Object) head).printForward());
			LinkedList clone = (LinkedList) head.clone();
			deleteDuplicates(head);
			System.out.println(((Object) head).printForward());
			deleteDuplicates(clone);
	}

}
