package P2721번_삼각수의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for (int j = 1; j <= n; j++)
                result += j * (j + 1) * (j + 2) / 2;
            sb.append(result).append('\n');
        }
        System.out.print(sb.toString());
    }
}