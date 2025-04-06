package BAEKJOON.Bronze.Bronze_III.P9517번_아이_러브_크로아티아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int player = Integer.parseInt(st.nextToken());
        int current = 0;
        st = new StringTokenizer(br.readLine());
        int question = Integer.parseInt(st.nextToken());
        for (int i = 0; i < question; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            char answer = st.nextToken().charAt(0);
            if (current + time > 210) {
                break;
            }
            if (answer == 'T') {
                if (++player > 8) {
                    player = 1;
                }
            }
            current += time;
        }
        System.out.println(player);
    }
}