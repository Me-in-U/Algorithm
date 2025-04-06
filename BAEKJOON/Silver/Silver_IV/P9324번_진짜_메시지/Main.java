package BAEKJOON.Silver.Silver_IV.P9324번_진짜_메시지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String line = br.readLine();
            int[] noise = new int[26];
            int i = 0;
            boolean fake = false;
            while (i < line.length()) {
                char c = line.charAt(i);
                if (++noise[c - 'A'] == 3) {
                    if ((i == line.length() - 1) || (c != line.charAt(i + 1))) {
                        fake = true;
                        break;
                    } else if (c == line.charAt(i + 1)) {
                        noise[c - 'A'] = 0;
                        i++;
                    }
                }
                i++;
            }
            sb.append(fake ? "FAKE" : "OK").append('\n');
        }
        System.out.print(sb.toString());
    }
}