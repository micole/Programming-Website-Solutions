package Easy.LifeUniverseAndEverything;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * 
 * @author codechef website
 * 
 */
public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		java.io.BufferedReader r = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		String s;
		while (!(s = r.readLine()).startsWith("42"))
			System.out.println(s);
	}
} 