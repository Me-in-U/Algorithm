package P1010번_다리_놓기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
   static int[][] dp = new int[30][30];
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
      StringBuilder sb = new StringBuilder();
      StringTokenizer st = null;

		int T = Integer.parseInt(br.readLine());
      for (int i = 0; i < T; i++) {
         st = new StringTokenizer(br.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());

         sb.append(combination(M, N)).append('\n');
      }
      System.out.println(sb);
	}
   //nCo = nCn = 1
   //nCr = n-1Cr-1 + n-1Cr
   static int combination(int n, int r) {
		if(dp[n][r] > 0) 
			return dp[n][r];
		if(n == r || r == 0) 
			return dp[n][r] = 1;
		
		return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
	}
}