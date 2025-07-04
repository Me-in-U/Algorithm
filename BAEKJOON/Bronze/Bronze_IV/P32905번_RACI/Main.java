package BAEKJOON.Bronze.Bronze_IV.P32905번_RACI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int countA = 0;
            for (int j = 0; j < m; j++) {
                String s = st.nextToken();
                if (s.charAt(0) == 'A') {
                    countA++;
                }
            }
            if (countA != 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
