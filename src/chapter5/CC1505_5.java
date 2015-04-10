/**
 * 
 */
package chapter5;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1505_5 {
	public static void main(String[] args){
		int test1= 0b100111010110;
		int test2= 0b011001000101;
		System.out.println(numberOfCovert(test1,test2));
	}
	static int bitSwapRequired(int a, int b){
	int count=0;
	int c=a^b;
	for(c=!0;c=>1){
	if(count=c&1){
	count++;
	}
	}
	return count;
		
	}
}
