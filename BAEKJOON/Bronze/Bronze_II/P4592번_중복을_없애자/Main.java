package BAEKJOON.Bronze.Bronze_II.P4592번_중복을_없애자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (data[0] == 0)
                break;
            int before = 0;
            for (int i = 1; i <= data[0]; i++) {
                if (before != data[i]) {
                    before = data[i];
                    sb.append(before).append(' ');
                }
            }
            sb.append("$\n");
        }
        System.out.print(sb.toString());
    }
}