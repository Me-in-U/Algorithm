package BAEKJOON.Bronze.Bronze_III.P7510번_고급_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());
        int[] edges = new int[3];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            edges[0] = Integer.parseInt(st.nextToken());
            edges[1] = Integer.parseInt(st.nextToken());
            edges[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(edges);
            sb.append("Scenario #").append(i).append(':').append('\n')
                    .append(((edges[0] * edges[0]) + (edges[1] * edges[1]) == (edges[2] * edges[2])) ? "yes" : "no")
                    .append("\n\n");
        }
        System.out.print(sb.toString().trim());
    }
}
