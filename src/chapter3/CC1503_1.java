/**
 * 
 */
import java.util.*;
import java.awt.*;
import java.*;
 
package chapter3;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1503_1 {
	 int stackSize=150;
     int[] buffer=new int[stackSize*3];
     int[] stackPointer={-1,-1,-1};
     
     void push(int stackNumber, int value) throws Excpetion{
    	 if(StackPointer[stackNumber]+1>=stackSize){
    		 throw new Exception("out of space");
    		 
    	 stackPointer[stackNumber]++;
    	 buffer[absTopOfStack(stackNumber)]=value;
    	 }
    	 int pop(int stackNumber) throws Exception{
    		 if(stackPointer[stackNum]==-1){
    			 throw new Exception("enmpty stack");
    			 }
    		 int value=buffer[absTopOfStack(stackNumber)];
    		 buffer[absTopOfStack(stackNum)]=0;
    		 stackPointer[stackNumber]--;
    		 return value;
    	 }
     int peek(int stackNum){
    	 int index=absTopOfStack(stackNum);
    	 return buffer[index];
     }
     boolean isEmpty(int stackNumber){
    	 return stackPointer[stackNumber]==-1;
    	 
     }
     int absTopOfStack(int stackNumber){
    	 return stackNumber*stackSize+stackPointer[stackNumber];
     }
     }
 

}
