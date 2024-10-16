package P3460번_이진수;

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
            int pos = 0;
            while (n != 0) {
                if (n % 2 == 1)
                    sb.append(pos).append(' ');
                n /= 2;
                pos++;
            }
            sb.append('\n');
        }
        System.out.print(sb.toString().trim());
    }
}