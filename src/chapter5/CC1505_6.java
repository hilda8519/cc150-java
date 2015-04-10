/**
 * 
 */
package chapter5;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1505_6 {
	public static int swap(int n) {
		int EvenBits = 0xAAAAAAAA & n;
		int OddBits = 0x55555555 & n;
		
		return( (OddBits << 1) | (EvenBits >> 1) );
	    }
	public static void main(String args[]){
	        int test = 0b0101110011;
	        System.out.println(Integer.toBinaryString(swap(test)));
	 
	 
	}
	 
}
