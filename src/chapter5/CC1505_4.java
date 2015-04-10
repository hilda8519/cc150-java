/**
 * 
 */
package chapter5;
import java.util.*;
/**
 * @author MaoTouMaoTou
 *
 */
public class CC1505_4 {
	public static void main(String[] args){
		System.out.println(match2Number(2,4));
	}
		
	static boolean match2Number(int N,int Number M) {
		M=N-1;
		if(M==null){
			return false;
		}
		if(N==null){
			return false;
		}
	if((N&M)==0){
		return true;
	}
		
		return false;
		
		}
}
