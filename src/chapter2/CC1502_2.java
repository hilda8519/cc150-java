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
public class CC1502_2 {

	public static <ListNode> int nthToL(ListNode head, int k){
		if(head==null){
			return 0;
			}
		int i=nthToL(head.next, k) +1;
		if(i==k){
			System.out.println(head.data);
	}
		return i;
	}
	public static void main(String[] args){
		List list=new List();
		for(int i=1;1<7;i++){
			System.out.println(i+"to the last element is"+(nthToL(list,i)==null?"null": nthToL(list,i).data));
		}
	}
}
