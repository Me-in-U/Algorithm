package 고려대학교_MatKor_Cup.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[0]);

        int min = Math.min(m, n) / a;
        int max = Math.max(m, n);
        if (min * 2 <= max) {
            System.out.println(max);
        } else {

        }
    }
}