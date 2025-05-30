package BAEKJOON.Silver.Silver_III.P15649번_N과_M_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static int[] arr;
	public static boolean[] check;
  
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    //입력
    StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

    //계산
		arr = new int[M];
		check = new boolean[N];
		dfs(N, M, 0);

    //출력
		System.out.println(sb);		
	}
  public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				check[i] = false;
			}
		}
	}
}