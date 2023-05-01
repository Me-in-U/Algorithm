package P15655번_N과_M_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int N, M;
	public static int[] input;
	public static int[] output;
	public static boolean[] visited;

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		// 입력
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		input = new int[N];
		output = new int[M];
		visited = new boolean[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		// 계산
		Arrays.sort(input);
		dfs(0, 0);

		// 출력
		System.out.println(sb);
	}

	public static void dfs(int pos, int depth) {
		if (depth == M) {
			for (int val : output) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = pos; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = input[i];
				dfs(i, depth + 1);
				visited[i] = false;
			}
		}
	}
}