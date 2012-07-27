package Easy.HS08TEST;

public class Main {


	public static void main(String[] args) throws java.lang.Exception {
		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String s = r.readLine();
		int withdraw = Integer.valueOf(s.split("\\s+")[0]);
		double balance = Double.valueOf(s.split("\\s+")[1]);
		if(withdraw%5 == 0 && balance - withdraw >= 0.50){
			balance -= (withdraw + .5);
		}
		System.out.format("%.2f%n", balance);
	}

}
