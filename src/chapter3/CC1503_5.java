/**
 * 
 */
package chapter3;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1503_5 {
	// push stack
	private Stack<T> s0;
	// poll stack
	private Stack<T> s1;
	private int number;
	 
	public MyQueue() {
	number = 0;
	s0 = new Stack<T>();
	s1 = new Stack<T>();
	}
	 
	public void push(T element) {
	s0.push(element);
	}
	 
	public static Stack<Integer> sort(Stack<Integer> s){
	Stack<Integer> s1=new Stack<Integer>();
	while(!s0.empty()) {
	int number=s0.pop();
	while(!s1.isEmpty()&&r.peek()>tmp){
	s1.push(s0.pop());
	}
	}
	return s1.pop();
	}

}
