package BAEKJOON.Bronze.Bronze_III.P11586번_지영_공주님의_마법_거울;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] lines = new String[N];
        for (int i = 0; i < N; i++)
            lines[i] = br.readLine();
        int K = Integer.parseInt(br.readLine());
        if (K == 1) {
            for (String line : lines)
                sb.append(line).append('\n');
        } else if (K == 2) {
            for (String line : lines)
                sb.append(new StringBuffer(line).reverse()).append('\n');
        } else if (K == 3) {
            for (String line : lines)
                sb.insert(0, line).insert(0, '\n');
        }
        System.out.print(sb.toString().trim());
    }
}
