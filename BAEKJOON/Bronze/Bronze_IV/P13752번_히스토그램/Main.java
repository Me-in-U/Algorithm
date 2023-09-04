package P13752번_히스토그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
      
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
         int K = Integer.parseInt(br.readLine());
         for(int j = 0; j < K; j++){
            sb.append("=");
         }
         sb.append('\n');
		}
      System.out.println(sb);
	}
}