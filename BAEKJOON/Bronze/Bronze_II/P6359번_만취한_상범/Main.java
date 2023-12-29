package BAEKJOON.Bronze.Bronze_II.P6359번_만취한_상범;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            boolean[] room = new boolean[N];
            for (int i = 0; i < N; i++)
                for (int j = i; j < N; j += i)
                    room[j] = !room[j];
            int count = 0;
            for (int i = 0; i < N; i++)
                if (room[i])
                    count++;
            sb.append(count).append('\n');
        }
        System.out.print(sb.toString());
    }
}
