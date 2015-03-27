/**
 * 
 */
package chapter1;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1501_8 {
	public static boolean isRotation(String s1, String s2) {
		int len=s1.length();{
		if(len==s2.length()&&len>0)//put s1 and s2 into a new buffer
		{
			String s1s1=s1+s1;//divide s1s1 into s1,s1
			return isSubstring(s1s1,s2);//call isSubTring
		}
	return false;
	}
	}
	private static boolean isSubstring(String s1s1, String s2) {//s2 is not a part of s1
		return false;
	}
	public static void main(String args[]) {
		String s1 = "erbottlewat";
		String s2 = "water";
		System.out.println(isRotation(s2, s1));
		
	}

}
