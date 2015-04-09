/**
 * 
 */
package chapter5;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1505_1 {
	public static int rewrite(int n, int m,int i, int j){
		//to all ones: 11111111111111111111111111111111
        int allOne = ~0;
        //all ones before j, then 0s
        int left = allOne << (j + 1);
        //all 0s before i, then 1s
        int right = ((1 << i) - 1);
        //all ones, but range i - j are 0s
        int mask = left | right;
        //clear bits through j to i
        int clear = n & mask;
        //move M to the right place
        int shift = m << i;
        //clear | shift
        return clear | shift;
    }
 
    public static void main(String[] args) {
        int N = 0b10000000000;
        int M = 0b10011;
        int i = 2;
        int j = 6;
        System.out.println(Integer.toBinaryString(rewrite(N, M, i, j)));
    }
}
