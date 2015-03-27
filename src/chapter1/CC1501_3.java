/**
 * 
 */
package chapter1;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1501_3 {
	public static boolean isPermutation(String s, String t){//compare s and t is permutation or not
		if(s.length() != t.length()){
			return false;
		}
	
	int[] letters = new int[256];//we suppose the string is ASCII, the length is 256

	char[] s_array = s.toCharArray();//change the characters to arrays
	
	for(char c: s_array){//for each character in s array
	    letters[c]++;//the number of character letter increase 1
		}
	for( int i =0; i<t.length();i++){//count the length of t array
		int c = (int)t.charAt(i);// c is in the index of t
		if(letters[c]-- < 0){
			return false;
		}
	}
			return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = isPermutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
	}
	}
}
