/**
 * 
 */
package chapter4;

/**
 * @author MaoTouMaoTou
 *
 */
import java.util.*;
public class CC1504_2 {
	public void bfs()
	{
		public static rootNode;
			
			
		// BFS uses Queue data structure
		Queue queue = new LinkedList();
		queue.add(this.rootNode);
		printNode(this.rootNode);
		rootNode.visited = true;
		while(!queue.isEmpty()) {
			Node node = (Node)queue.remove();
			Node child=null;
			while((child=getUnvisitedChildNode(node))!=null) {
				child.visited=true;
				printNode(child);
				queue.add(child);
			}
		}
		// Clear visited property of nodes
		clearNodes();
}
