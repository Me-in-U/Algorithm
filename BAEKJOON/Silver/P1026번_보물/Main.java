package P1026번_보물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine());

      int arr_A[] = new int[N];
      int arr_B[] = new int[N];

      st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
         arr_A[i] = Integer.parseInt(st.nextToken());
		}
      st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
         arr_B[i] = Integer.parseInt(st.nextToken());
		}

      Arrays.sort(arr_A);
      Arrays.sort(arr_B);

      int sum = 0;
      for(int i = 0; i < N; i++){
         sum += arr_A[i] * arr_B[N - 1 - i];
      }
      System.out.println(sum);
	}
}