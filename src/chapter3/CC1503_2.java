/**
 * 
 */
package chapter3;

import java.util.Stack;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1503_2 {
	public class StackwithMin extends Stack<Integer>{
		Stack<Integer> s2;//define stack s2 as the request stack
		public StackwithMin(){
			s2 = new Stack<Integer>();
		}
	public void push(int value){
		if(value<=min()){
			s2.push(value);
		}
	super.push(value);
	}
	public Integer pop(){
		int value = super.pop();
		if(value == min()){
			s2.pop();
		}
	    return value;
	}
	
	public int min(){
		if(s2.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return s2.peek();
		}
	}
	}
	public static void main(String[] args) {
		StackwithMin stack = new StackwithMin();
		StackwithMin2 stack2 = new StackwithMin2();
		for (int i = 0; i < 15; i++) {
			int value = AssortedMethods.randomIntInRange(0, 100);
			stack.push(value);
			stack2.push(value);
			System.out.print(value + ", ");
		}
		System.out.println('\n');
		for (int i = 0; i < 15; i++) {
			System.out.println("Popped " + stack.pop().value + ", " + stack2.pop());
			System.out.println("New min is " + stack.min() + ", " + stack2.min());
		}

	}

}
