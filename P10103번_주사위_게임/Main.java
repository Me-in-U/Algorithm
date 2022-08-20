package P10103번_주사위_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

      int a_score = 100;
      int b_score = 100;

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
         st = new StringTokenizer(br.readLine());
         
         int a_dice = Integer.parseInt(st.nextToken());
         int b_dice = Integer.parseInt(st.nextToken());
         
         if(a_dice < b_dice)
            a_score -= b_dice;
         else if (a_dice > b_dice)
            b_score -= a_dice;
		}
      System.out.println(a_score);
      System.out.println(b_score);
	}
}
