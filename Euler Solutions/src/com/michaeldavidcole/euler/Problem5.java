package com.michaeldavidcole.euler;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author micole
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 */
public class Problem5 {

	public static void main(String[] args) {
		int x = 20;
		//ArrayList<Integer> factors = new ArrayList<Integer>();
		PrimeAndFactor prime = new PrimeAndFactor();
		List<Integer> iPrimes = prime.FindPrimesUpToN(x);
		List<Integer> iFactor = new ArrayList<Integer>(iPrimes.size());
		for(int i : iPrimes){
			iFactor.add(0);
		}
		
		
		List<Integer> primeFactorReturn;
		for (int i = 2; i <= x; i++){
			//System.out.println(prime.PrimeFactorN(i));
			primeFactorReturn = prime.PrimeFactorN(i);
			int tempSize;
			for(int primeSize = 0; primeSize < iPrimes.size(); primeSize++){
				tempSize = 0;
				for(int y:primeFactorReturn){
					if(y == iPrimes.get(primeSize))
						tempSize++;
				}
				if(tempSize > iFactor.get(primeSize))
					iFactor.set(primeSize, tempSize);
			}
			
			//factors.add(prime.PrimeFactorN(i));
		}
		int total =1;
		for(int i = 0; i< iPrimes.size(); i++){
			System.out.println(iPrimes.get(i) + " " + iFactor.get(i));
			total = (int) (total * Math.pow(iPrimes.get(i),iFactor.get(i)));
		}
		System.out.println(total);
		
		//System.out.println(factors);
		
		
	}

}

