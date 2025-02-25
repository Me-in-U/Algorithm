package Technical_Support;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Technical_Support {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			String QA = br.readLine();
			int Q = 0;
			for (int j = 0; j < n; j++) {
				char c = QA.charAt(j);
				if (c == 'Q')
					Q++;
				else {
					if (Q != 0) {
						Q--;
					}
				}
			}
			if (Q > 0) {
				sb.append("No").append('\n');
			} else {
				sb.append("Yes").append('\n');
			}
		}
		System.out.print(sb.toString());
	}
}