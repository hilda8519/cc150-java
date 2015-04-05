/**
 * 
 */
package chapter3;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1503_6 {

	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> r = new Stack<Integer>();
		while (!s.isEmpty()) {
		int tmp= s.pop(); 
		while (!r.isEmpty() && r.peek() > tmp) { 
		s.push(r.pop());
		}
		r.push(tmp); 
		}
		return r;
		}
			public static void main(String[] args) {
		 
		Stack<Integer> test = new Stack<Integer>();
		for (int i = 0; i < 10; i++)
		test.enqueue(i);
		for (int i = 0; i < 5; i++)
		System.out.println(test.dequeue());
		for (int i = 10; i < 15; i++)
		test.enqueue(i);
		for (int i = 0; i < 10; i++)
		System.out.println(test.dequeue());

}
}
