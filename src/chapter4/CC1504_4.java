/**

 * 
 */
import java.util.*;
package chapter4;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1504_4 {
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
	ArrayList<List<Node>> createLevelList(Node root){
		ArrayList<ListNode> result=new ArrayList<ListNode>();	
		ListNode current=new ListNode(val);
		if(root!=null){
			current.add(root);
		}
		
		while(((List<List<Node>>) current).size()>0){
			result.add(current);
			List<Node> parents=(List<Node>) current;
			current=new ListNode(val);
			for(Node parent:parents ){
				if(parent.left!=null){
					current.add(parent.left);
					
				}
				else{
					current.add(parent.right);
				}
			}
		}
		return null;
	}
	private void add(Node left) {
		// TODO Auto-generated method stub
		if(left==null) return;
		if(left!=null)
		{
			result.get(current).add(current);
		}
	}
	public static void main(String[] args) {
		Node root = new Node(0);
		List<List<Integer>> expected = new LinkedList<List<Integer>>();
		expected.add(Arrays.asList(0));
		assert expected.equals(ListNode(root));
		root.right = new Node(2);
		expected.add(Arrays.asList(2));
		assert expected.equals(ListNode(root));
		root.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(4);
		expected.remove(1);
		expected.add(1, Arrays.asList(1, 2));
		expected.add(Arrays.asList(3, 4));
		assert expected.equals(ListNode(root));
	 
		System.out.println("results:"+ListNode(root));
	 
	}
	}

}
