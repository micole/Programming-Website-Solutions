import java.awt.List;

/**
 * 
 * @author micole
 * For day one of the Kata Two I planned on 
 * doing a simple iterative approach to the 
 * problem.
 * http://codekata.pragprog.com/2007/01/kata_two_karate.html
 */
public class KataTwoDayOne {
	
	public int chop(int x, int[] array){
		int front = 0; 
		int back = array.length-1;
		int middle;
		while(front <= back){
			middle = front + (back - front) / 2;
			if (x < array[middle]){
				back = middle -1;
			}
			else if(x > array[middle]){
				front = middle + 1;
			}
			else{
				return middle;
			}
		}
		
		return -1;
	}
	
}
