package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author micole
 * 
 */
public class LifeUniverseAndEverything {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			String str = "";
			while (str != "42") {
				System.out.print(str);
				str = in.readLine();
			}
		} catch (IOException e) {
			//do nothing
		}
	}

}
