package BAEKJOON.Silver.Silver_V.P30457번_단체줄넘기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] students = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        boolean[] line1 = new boolean[1001];
        boolean[] line2 = new boolean[1001];
        for (int height : students) {
            if (!line1[height]) {
                line1[height] = true;
            } else if (!line2[height]) {
                line2[height] = true;
            }
        }
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (line1[i])
                count++;
            if (line2[i])
                count++;
        }
        System.out.println(count);
    }
}
