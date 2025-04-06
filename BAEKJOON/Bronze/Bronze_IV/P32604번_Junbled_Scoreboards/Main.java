package BAEKJOON.Bronze.Bronze_IV.P32604번_Junbled_Scoreboards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        String[] scores = null;
        boolean chronological = true;
        while (N-- > 0) {
            scores = br.readLine().split(" ");
            if (chronological) {
                int new_a = Integer.parseInt(scores[0]);
                int new_b = Integer.parseInt(scores[1]);
                if (new_a < a || new_b < b) {
                    chronological = false;
                }
                a = new_a;
                b = new_b;
            }
        }
        System.out.println(chronological ? "yes" : "no");
    }
}