package P16212번_정열적인_장랼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int arr[] = new int[N];
		for(int i = 0; i < N; i++){
      arr[i] = Integer.parseInt(st.nextToken());
		}
    Arrays.sort(arr);
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < N; i++){
      sb.append(arr[i] + " ");
		}
    System.out.println(sb.toString());
	}
}