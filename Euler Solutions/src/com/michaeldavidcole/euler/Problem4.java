package com.michaeldavidcole.euler;
import java.util.Vector;

/**
 * 
 * @author micole
 *
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */
public class Problem4 {
	

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();//Original idea was to use threads
		for(int i = 999; i > 900; i--){
			for(int x = i; x > 900; x--){
				list.add(x*i);
			}
		}
		int largest = 0;
		for(Integer num : list){
			if(isPalindrome(num) && num > largest){
				largest = num;
			}
		}
		System.out.println(largest);

	}
	
	public static boolean isPalindrome(int num){
		String reverse = "";
		String number = Integer.toString(num);
		for(int i = 1; i <= number.length(); i++){
			reverse = reverse + number.charAt(number.length()-i);
		}
		return reverse.equalsIgnoreCase(number);
	}
	
	public static void testIsPalindrome(){
		System.out.println(isPalindrome(9009));
		System.out.println(isPalindrome(909));
		System.out.println(isPalindrome(90109));
		System.out.println(isPalindrome(900));
		System.out.println(isPalindrome(9000));
	}
	

}
