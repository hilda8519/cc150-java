/**
 * 
 */
package chapter9;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1509_1 {
	public static int numberways(int n){
		if(n<0){
			return 0;
		}
	if(n==0){
		return -1;
	}
	else{
		return numberways(n-1)+numberways(n-2)+numberways(n-3);
	}
	}
public static int numberwaysDP(int n, int[] map){
	if(n < 0){
		return 0;
	}
    if(n == 0){
    	return 1;
    }
if(map[n]>-1){
	return map[n];
}
else{
	map[n] = numberwaysDP(n-1, map)+numberwaysDP(n-2, map)+ numberwaysDP(n-3, map);
  return map[n];
}
}
public static void main(String[] args){
	System.out.println(numberways(100));
}
}
