package P17263_Sort_마스터_배지훈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int max = -1;

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
         int a = Integer.parseInt(st.nextToken());
         if(a > max){
            max = a;
		   }
      }
      System.out.println(max);
	}
}