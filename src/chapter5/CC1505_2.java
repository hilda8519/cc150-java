/**
 * 
 */
package chapter5;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1505_2 {
	public static void main(String[] args){
		System.out.println(printBinary(0.111111));
		System.out.println(printBinary(0.8));
	}
	static String printBinary(double num){
		if(num>1 || num<0)
			return "ERROR";
		
		double remain = num;
		StringBuffer buffer = new StringBuffer();
		buffer.append(".");
		while(remain>0){
			if(buffer.length()>32){
				return "ERROR";				
			}
			if(remain >= 0.5){
				buffer.append(1);
				remain = remain-0.5;
			}
			else
				buffer.append(0);
			remain=remain*2;
		}
		
		return buffer.toString();
	}
 

}
