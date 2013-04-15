/*
 * Problem C: https://code.google.com/codejam/contest/2270488/dashboard#s=p2
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/**
 * 
 * @author micole
 */
public class problemc {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				System.out));

		HashMap<Integer, Integer> squares = new HashMap<Integer, Integer>();

		int TestCases = Integer.parseInt(in.readLine());

		for (int t = 0; t < TestCases; t++) {
			int count = 0;
			String arg = in.readLine();
			String[] split = arg.split(" ");
			int arg1 = Integer.parseInt(split[0]);
			int arg2 = Integer.parseInt(split[1]);

			double squareRooted;

			for (int i = arg1; i <= arg2; i++) {
				if (squares.containsKey(i)) {
					count++;
				} else {
					squareRooted = Math.sqrt(i);
					if (squareRooted % 1 == 0) {
						if (isPalindrome((int) (squareRooted))) {
							if (isPalindrome(i)) {
								count++;
							}
						}
					}
				}
			}
			out.append("Case #" + (t+1) + ": " + String.valueOf(count) + "\n");
		}

		out.flush();

	}

	public static boolean isPalindrome(int i) {
		String x;
		String y = "";
		x = String.valueOf(i);
		y = new StringBuffer(x).reverse().toString();
		return x.compareTo(y) == 0;
	}

}
