package P11021번_A더하기B_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

      StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++){
         st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         sb.append("Case #" + i + ": " + (a + b)).append('\n');
		}
      System.out.println(sb.toString());
	}
}