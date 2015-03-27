/**
 * 
 */
package chapter1;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1501_5 {
		public static String compBet (String s){
			int size=countCompression(s);
			if(size>s.length()){
				return s;
			}
			
			StringBuffer t=new StringBuffer();//construct one buffer to store the temp
			int count=1;
		    char tempchart=s.charAt(0);
			for(int i=1;i<s.length();i++){
			if(s.charAt(i)==tempchart){
			count++;
				 }
			else
			{
				t.append(tempchart);
				t.append(count);
				tempchart=s.charAt(i);
				count=1;
			}
			}
			t.append(tempchart);
			t.append(count);
			return t.toString();
		}
			
           static int countCompression(String s){//calculate the compression count in the string
				if(s==null||s.isEmpty()){//if is empty
					return 0;
			}
				char tempchart=s.charAt(0);//temp is the 1st index in s
				int count=1;//count from 1 for the character repeat is 1
				int size=0;
			for(int i=1;i<s.length();i++){
				if(s.charAt(i)==tempchart){//if the character is the same one in the temp
				count++;
					 }
				else
				{
					tempchart=s.charAt(i);	
				size+=1+String.valueOf(count).length();
				count=1;
				}
				size+=1+String.valueOf(count).length();
				return size;
				
				}
			return size;
			}
			public static void main(String[]  args){
			{
				String s="aaaaabbb";
				System.out.println(compBet(s));
				System.out.println(s);
			}
			}
			}
			
