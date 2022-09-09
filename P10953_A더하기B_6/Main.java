package P10953_A더하기B_6;

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
		for(int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine(), ",");
      sb.append((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))).append('\n');
		}
    System.out.println(sb.toString());
	}
}