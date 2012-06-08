import java.util.ArrayList;

/**
 * 
 * @author micole
 * 
 *         After figuring out that most of the problems on Project Euler I
 *         wanted a class that could do some basic things like: Finding all the
 *         primes up to N Finding N primes Factoring N into the prime factors
 */

//TODO: More testing with this function. Sometimes it seems to give the wrong
// sizes when it has to find primes up to N.
public class PrimeAndFactor {
	ArrayList<Integer> primes = new ArrayList<Integer>();
	ArrayList<Integer> factors;

	public PrimeAndFactor() {
		//Try and get rid of some overhead
		FindNPrimes(20);
	}

	/**
	 * This function will make the primes list populate with primes up to N An
	 * example of this is FindNPrimes(3) will populate primes with 2,3,5. It
	 * returns primes(an arraylist) so if you call it again the data does not
	 * have to do the math again for the ones you already found.
	 * 
	 * @param n
	 * @return list of n primes
	 */
	public java.util.List<Integer> FindNPrimes(int n) {
		int current;
		try {
			current = primes.get(primes.size() - 1);
		} catch (Exception e) {
			current = 1;
		}
		boolean add = true;
		while (primes.size() < n) {
			add = true;
			current++;
			for (int x : primes) {
				if (current % x == 0) {
					add = false;
					break;
				}
			}
			if (add)
				primes.add(current);
		}
		return primes.subList(0, n);
	}

	/**
	 * This function will find primes up to but not beyond N An example of this
	 * is FindPrimesUpToN(20) will return
	 * 
	 * @param n
	 * @return list of primes up to n
	 */
	public java.util.List<Integer> FindPrimesUpToN(int n) {
		int endIndex = 0;
		boolean add = true;
		int current = 1;
		
			if (primes.get(primes.size()-1) >= n) {
				// System.out.println("Already have this number");
				for (int i = 0; i < primes.size(); i++) {
					if (primes.get(i) >= n) {
						endIndex = i+1;
						break;
					}
				}
			}
			else {

			
			while (endIndex < n) {
				add = true;
				current++;
				for (int x : primes) {
					if (current % x == 0) {
						add = false;
						break;
					}
				}
				if (add)
					primes.add(current);
				if (current >= n) {
					endIndex = primes.size();
					break;

				}
			}
		}

		return primes.subList(0, endIndex);
	}

	/**
	 * This function returns a list of the prime factors of N An example of this
	 * is PrimeFactorN(1000) which returns 2,2,2,5,5,5
	 * 
	 * @param n
	 * @return List of prime factors
	 */
	public java.util.List<Integer> PrimeFactorN(int n) {
		int currentIndex = 0;
		int current;
		factors = new ArrayList<Integer>();
		FindPrimesUpToN(n);
		while (n != 1) {
			current = primes.get(currentIndex);
			if (n % current == 0) {
				factors.add(current);
				n = n / current;
			} else {
				currentIndex++;
			}
		}
		return factors.subList(0, factors.size());

	}
	
	/**
	 * This function returns a list of all the dividers of N. An example of this
	 * is FindDivisorsForN(6) will return (1,2,3,6)
	 */
	public java.util.List<Integer> FindDivisorsForN(int n){
		FindPrimesUpToN(n);
		factors = new ArrayList<Integer>();

		for(int i = 1; i <=n; i++){
			if(n%i == 0){
				factors.add(i);
			}
		}

		return factors.subList(0, factors.size());
	}

}
