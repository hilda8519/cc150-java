/**
 * 
 */
package chapter5;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1505_8 {
	 public void drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y) {
	        int height = screen.length / (width / 8);
	        if (y < 0 || y >= height || x1 < 0 || x1 >= screen.length * 8 || x2 < 0 || x2 >= screen.length * 8) {
	            return;
	        }
	        
	        int idx = y * (width / 8);
	        int idx1 = idx + (x1 / 8);
	        int idx2 = idx + (x2 / 8);
	        
	        for (int i = idx1 + 1; i < idx2; ++i) {
	            screen[i] = (byte) 0xFF;
	        }
	 
	        byte mask1 = (byte) (0xff >>> x1 % 8);
	        byte mask2 = (byte) (~((1 << (7 - x2 % 8)) - 1));
	        if (idx1 == idx2) {
	            screen[idx1] |= (mask1 & mask2);
	        } else {
	            screen[idx1] |= mask1;
	            screen[idx2] |= mask2;
	        }
	    }
	    
	    
	    public static void main(String[] args) {
	    
	         public static void main(String[] args) {
		int screen[] =  new int[]{0, 0, 0, 0, 0, 0, 1£¬1£¬1£¬1£¬1£¬1};
		int width = 32;
		//showScreen(screen, width);
		drawHorizontalLine(screen, width, 2, 7, 1);
		showScreen(screen, width);
	    }
	    }
}
