package P9095번_123_더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
         int n = Integer.parseInt(br.readLine());
         sb.append(recur(n)).append('\n');
		}
      System.out.print(sb.toString());
	}
   public static int recur(int n) {
      if(n == 1) 
         return 1;
      if(n == 2) 
         return 2;
      if(n == 3) 
         return 4;
      else
         return recur(n - 3) + recur(n - 2) + recur(n - 1);
   }
}