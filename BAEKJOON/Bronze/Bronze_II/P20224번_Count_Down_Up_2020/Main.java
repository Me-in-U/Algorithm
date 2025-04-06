package BAEKJOON.Bronze.Bronze_II.P20224번_Count_Down_Up_2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        while (Integer.parseInt(br.readLine()) != 0) {
            String[] d = br.readLine().split(" ");
            int count = 0;
            for (int i = 0; i < d.length - 3; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(d[i]).append(d[i + 1]).append(d[i + 2]).append(d[i + 3]);
                if (sb.toString().equals("2020")) {
                    count += 1;
                }
            }
            result.append(count).append('\n');
        }
        System.out.print(result.toString());
    }
}
