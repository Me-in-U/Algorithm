package P10996번_별_찍기_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
		for(int k = 0; k < N; k++){
			for(int i = 0; i < N; i++){
				if(i % 2 == 0){
          sb.append("*");
				}				
				else{
          sb.append(" ");
				}
			}
			sb.append('\n');
			for(int j = 0; j < N; j++){
				if(j % 2 == 0){
          sb.append(" ");
				}
				else{
          sb.append("*");
				}
			}
			sb.append('\n');
		}
    System.out.print(sb);
	}
}