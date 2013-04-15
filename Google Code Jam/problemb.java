/*
 * Problem B: https://code.google.com/codejam/contest/2270488/dashboard#s=p1
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class problemb {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				System.out));

		
		int TestCases = Integer.parseInt(in.readLine());
		for (int t = 0; t < TestCases; t++){
			
			String[] arg = in.readLine().split(" ");
			int row = Integer.parseInt(arg[0]);
			int col = Integer.parseInt(arg[1]);
			ArrayList<ArrayList<Integer>> lawn = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < row; i++){
				lawn.add(new ArrayList<Integer>());
				String[] split = in.readLine().split(" ");
				for(int j = 0; j < col; j++){
					lawn.get(i).add(Integer.parseInt(split[j]));
				}
			}
			
			while(!lawn.isEmpty()){
				int min = lawn.get(0).get(0); 
				int locx = 0;
				int locy = 0;
				for(int i = 0; i < lawn.size(); i++){
					for(int j = 0; j < lawn.get(i).size(); j++){
						if(lawn.get(i).get(j) <= min){
							min = lawn.get(i).get(j);
							locx = i;
							locy = j;
						}
					}
				}
				
				boolean checkCol = true;
				boolean checkRow = true;
				int countCol = 0;
				int countRow = 0;
				
				for(int i = 0; i < lawn.size(); i++){
					if(lawn.get(i).get(locy) != min){
						//countRow++;
						checkRow = false;
					}
				}
				//if(countRow )
				
				for(int j = 0; j < lawn.get(locx).size(); j++){
					if(lawn.get(locx).get(j) != min){
						//countCol++;
						checkCol = false;
					}
				}
				
				if(!checkCol && !checkRow){
					out.write("Case #" + (t+1) + ": NO\n");
					break;
				}
				
				if(checkCol){
					lawn.remove(locx);
					continue;
				}
				else if(checkRow){
					for(int i = 0; i < lawn.size(); i++){
						lawn.get(i).remove(locy);
					}
					continue;
				}

			}
			if(lawn.size() == 0){
				out.write("Case #" + (t+1) + ": YES\n");
			}
		}
		out.flush();
		
	}
}
