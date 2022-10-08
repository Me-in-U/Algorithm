package P11053번_가장_긴_증가하는_부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine());

		int num[] = new int[N + 1];
		int dp[] = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			dp[i] = 1;
			for (int k = 0; k < i; k++) {
				if (num[i] > num[k]) {
					dp[i] = Math.max(dp[i], dp[k] + 1);
				}
			}
		}

		int result = 0;
		for (int r : dp) {
			result = Math.max(r, result);
		}
		System.out.println(result);
	}
}