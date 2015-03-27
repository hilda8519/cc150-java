/**
 * 
 */
package chapter1;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1501_4 {
public static void replace(char[] str, int length ){
	int countspace = 0;
	int newlength;
	for(int i=0; i < length; i++){
		if(str[i] == ' '){//if the character in the string is empty
			countspace++;
		}
	}
	newlength = length+countspace*2;//replaced with %20
	str[newlength] = '\0';//the new string length start with 0, we will construct it 
    for(int j = length -1; j>=0; j--){//reversed the old array from the second last one, 
    	                              //for we assume there is no space after the last one.
    if(str[j] == ' '){
    	str[newlength-1] = '0';//replace '0'
    	str[newlength-2] = '2';// replace '2'
    	str[newlength-3] ='%';// replace '%'
    	newlength = newlength-3;
    }
    else{
    	str[newlength-1] = str[j];
        newlength = newlength -1;
    }
    }
}
	
	public static void main(String[] args) {
		String str = "a bc def  g";
	    char[] arr = new char[str.length()+ 4*2+1];//calculate the new string length
	    for(int i = 0; i < str.length(); i++){
	         arr[i] = str.charAt(i);
	}
	replace(arr,str.length());//replace array into new array with ¡®%20¡¯
	System.out.println(arr);
}
}