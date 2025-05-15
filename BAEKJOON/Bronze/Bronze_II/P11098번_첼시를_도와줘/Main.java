package BAEKJOON.Bronze.Bronze_II.P11098번_첼시를_도와줘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(br.readLine().trim());
            int maxMoney = -1;
            String winner = "";

            for (int j = 0; j < p; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int money = Integer.parseInt(st.nextToken());
                String name = st.nextToken();

                if (money > maxMoney) {
                    maxMoney = money;
                    winner = name;
                }
            }
            sb.append(winner).append('\n');
        }
        System.out.print(sb);
    }
}
