import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: micole
 * Date: 8/9/13
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem14 {

    public static void main(String[] args){
        long[] collatzList = new long[1000000];

        int largest = 0;
        int largestValue = 0;

        collatzList[0] = 1L;

        for(int i = 0; i <= 1000000; i++){
            if(collatzList[i] == 0){
                int count = 0;
                long temp = i + 1;
                while(temp != 1){
                    count++;
                    if((temp % 2) == 0){
                        temp = temp / 2;
                    } else {
                        temp = (temp * 3) +1;
                    }
                }
                count++;
                collatzList[i] = count;
                if(count > largest){
                    largestValue = i+1;
                }
            }
        }
    }

}
