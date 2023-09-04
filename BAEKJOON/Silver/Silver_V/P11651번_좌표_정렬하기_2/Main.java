package P11651번_좌표_정렬하기_2;

import java.util.Arrays;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			// 위치 주의
			st = new StringTokenizer(br.readLine());
			arr[i][1] = Integer.parseInt(st.nextToken()); //x
			arr[i][0] = Integer.parseInt(st.nextToken()); //y
		}
		
		Arrays.sort(arr, (e1, e2) -> {
      //y좌표가 같다면
			if(e1[0] == e2[0]) {
        //x 교환
				return e1[1] - e2[1];
			}
      //y좌표가 다르면
      else {
        //y교환
				return e1[0] - e2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< N ; i++) {
			// 위치 주의
			sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
		}
		System.out.println(sb);
	}
 
 
}