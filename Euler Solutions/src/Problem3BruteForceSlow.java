import java.util.ArrayList;

/**
 * 
 * @author micole
 *
 *	The prime factors of 13195 are 5, 7, 13 and 29.
 *	What is the largest prime factor of the number 600,851,475,143 ?
 *
 *
 * Why this program fails:
 * This program will usually end in a stack overflow because of the large stack I'm making
 * in the makePrimeList function. It 
 */
public class Problem3BruteForceSlow {
	static ArrayList<Long> primes = new ArrayList<Long>();
	
	public static void main(String[] args){
		long goalNumber = 600851475143L; //the L dictates it to be a long number
		//First try, http://en.wikipedia.org/wiki/Trial_division
		//Essentially, make every prime number up to the sqrt(n), and figure out if any are divisible
		makePrimes(goalNumber); 
		
		System.out.println(primes);
		
		long biggest = 0L;
		for(long current:primes){
			if (goalNumber%current == 0)
				biggest = current;
		}
		System.out.println("The biggest prime factorization is: " + biggest);
		System.out.println("If the number is 0, the number might be prime");
	}
	
	private static void makePrimes(long n){
		long x = (long) Math.sqrt(n);
		for(long y = 2L; y < x; y++){
			makePrimeList(x,y); 
			//I originally tried to make this recursive, but always ended up with stackoverflows
		}
		
		
	}
	
	private static void makePrimeList(long x, long current){
		//System.out.println(primes);
		boolean add = true;
		for(long a : primes){ 
			if(current%a == 0){
				add = false;
				break;
			}
		}
		if(add)
			primes.add(current);
	}
}
