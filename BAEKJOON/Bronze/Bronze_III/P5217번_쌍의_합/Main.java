package P5217번_쌍의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append("Pairs for ").append(n).append(": ");
            int start = 1;
            for (int k = 0; k < (n - 1) / 2; k++) {
                if (k != 0)
                    sb.append(", ");
                sb.append(start).append(" ").append(n - start);
                start++;
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}