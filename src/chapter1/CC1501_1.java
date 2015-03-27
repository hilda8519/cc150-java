/**
 * 
 */
package chapter1;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1501_1 {
public static boolean isUniqueChar(String str){
	if(str.length() > 256){
		return false;
	}
	boolean[] char_set = new boolean[256];
	for(int i=0; i<str.length(); i++){
		/**
		 * @param goes into interation
		 */
		int val = str.charAt(i);
		// define val as the character that we want to know whether or not it is repeated
		if(char_set[val]){//if val is existed in the character set
			return false;// return false
		}
			char_set[val]=true;
	}
		return true;
}
	
	public static void main(String[] args) {
		// test cases
		String[] Words =  {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : Words) {
			System.out.println(word + ": " + " " + isUniqueChar(word));
		}

	}

}
