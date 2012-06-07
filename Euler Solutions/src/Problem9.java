
/**
 * Author note: I feel like I'm solving a lot of these problems with brute force.
 * Are most of these like that?
 * If not, I need to figure out better ways of doing the problems.
 * @author micole
 *
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 {

	
	public static void main(String[] args) {
		int c;
		for(int a = 1; a < 1000; a++){
			for(int b = a+1; b < 1000; b++){
				c = 1000 - (a + b);
				if((a*a + b*b) == (c*c))
					System.out.println(a*b*c);
			}
		}

	}

}
