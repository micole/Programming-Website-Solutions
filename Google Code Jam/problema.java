/*
 * Problem A: https://code.google.com/codejam/contest/2270488/dashboard#s=p0
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problema {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				System.out));

		int TestCases = Integer.parseInt(in.readLine());

		for (int testCase = 0; testCase < TestCases; testCase++) {
			//out.flush();
			boolean win = false;
			boolean gameOver = true;
			String[][] grid = new String[4][4];
			for (int i = 0; i < 4; i++) {
				String line = in.readLine();
				// System.out.println(line);
				char[] lineBrokenUp = line.toCharArray();
				for (int j = 0; j < 4; j++) {
					grid[i][j] = String.valueOf(lineBrokenUp[j]);
					if (grid[i][j].compareTo(".") == 0) {
						gameOver = false;
					}
				}
			}

			// horz
			for (int i = 0; i < 4; i++) {
				int x = 0;
				int o = 0;
				int t = 0;
				for (int j = 0; j < 4; j++) {

					if (grid[i][j].compareTo("X") == 0) {
						x += 1;
					}
					if (grid[i][j].compareTo("T") == 0) {
						t += 1;
					}
					if (grid[i][j].compareTo("O") == 0) {
						o += 1;
					}
				}

				if (x + t == 4) {
					out.write("Case #" + (testCase + 1) + ": X won\n");
					win = true;
					break;
				}
				if (o + t == 4) {
					out.write("Case #" + (testCase + 1) + ": O won\n");
					win = true;
					break;
				}

			}
			if (win) {
				in.readLine();
				continue;
			}
			// vert
			for (int i = 0; i < 4; i++) {
				int x = 0;
				int o = 0;
				int t = 0;
				for (int j = 0; j < 4; j++) {

					if (grid[j][i].compareTo("X") == 0) {
						x += 1;
					}
					if (grid[j][i].compareTo("T") == 0) {
						t += 1;
					}
					if (grid[j][i].compareTo("O") == 0) {
						o += 1;
					}
				}

				if (x + t == 4) {
					out.write("Case #" + (testCase + 1) + ": X won\n");
					win = true;
					break;
				}
				if (o + t == 4) {
					out.write("Case #" + (testCase + 1) + ": O won\n");
					win = true;
					break;
				}

			}
			if (win) {
				in.readLine();
				continue;
			}
			// backslash
			int x = 0;
			int o = 0;
			int t = 0;
			for (int i = 0; i < 4; i++) {

				if (grid[i][i].compareTo("X") == 0) {
					x += 1;
				}
				if (grid[i][i].compareTo("T") == 0) {
					t += 1;
				}
				if (grid[i][i].compareTo("O") == 0) {
					o += 1;
				}
			}

			if (x + t == 4) {
				out.write("Case #" + (testCase + 1) + ": X won\n");
				win = true;
				in.readLine();
				continue;
			}
			if (o + t == 4) {
				out.write("Case #" + (testCase + 1) + ": O won\n");
				win = true;
				in.readLine();
				continue;
			}
			/**
			 * if (win) { in.readLine(); continue; }
			 */

			// forwardslash
			x = 0;
			o = 0;
			t = 0;
			for (int i = 0; i < 4; i++) {

				if (grid[i][3 - i].compareTo("X") == 0) {
					x += 1;
				}
				if (grid[i][3 - i].compareTo("T") == 0) {
					t += 1;
				}
				if (grid[i][3 - i].compareTo("O") == 0) {
					o += 1;
				}
			}

			if (x + t == 4) {
				out.write("Case #" + (testCase + 1) + ": X won\n");
				win = true;
				in.readLine();
				continue;
			}
			if (o + t == 4) {
				out.write("Case #" + (testCase + 1) + ": O won\n");
				win = true;
				in.readLine();
				continue;
			}
			/**
			 * if (win) { in.readLine(); continue; }
			 */

			if (!gameOver && !win) {
				out.write("Case #" + (testCase + 1)
						+ ": Game has not completed\n");
				in.readLine();
				continue;
			}
			// if (gameOver && !win) {
			out.write("Case #" + (testCase + 1) + ": Draw\n");
			in.readLine();
			// continue;
			// }
		}
		out.flush();
	}
}
