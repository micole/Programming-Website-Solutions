package euler;
import java.util.List;

/**
 *  Author note: This takes a lot of time. Need to speed it up.
 * @author micole
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Problem10 {

	
	public static void main(String[] args) {
		long total = 0; //This was accidentally an int before :X it gave the wrong answer
		PrimeAndFactor prime = new PrimeAndFactor();
		List<Integer> primes = prime.FindPrimesUpToN(2000000);
		for(int x:primes){
			total += x;
		}
		System.out.println(total);
	}
	
}
