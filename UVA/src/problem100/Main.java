package problem100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: micole
 * Date: 9/8/13
 * Time: 8:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){    // entry point from OS
        Main myWork = new Main();    // create a dinamic instance
        myWork.begin();            // the true entry point
    }

    void begin(){
        Scanner in = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(in.hasNextInt()){
            int i = in.nextInt();
            int j = in.nextInt();
            int smallest = Math.min(i,j);
            int largest = Math.max(i,j);
            int max = 0;
            int temp = 0;

            for(int z = smallest; z <= largest; z++){
                temp = collatz(z);
                max = max > temp ? max : temp;
            }
            System.out.printf("%d %d %d\n", i, j, max);
        }
    }

    int collatz(int i){
        int count = 1;
        while (i != 1){
            count++;
            if(i%2 == 0){
                i /= 2;
            } else {
                i = (i * 3) + 1;
            }
        }
        return count;
    }
}
