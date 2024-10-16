package P17404번_RGB거리_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 1_000_000;
    static final int RED = 0;
    static final int GREEN = 1;
    static final int BLUE = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] cost = new int[N][3];
        int[][] minCost = new int[N][3];
        int answer = INF;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int firstColor = 0; firstColor < 3; firstColor++) {
            for (int color = 0; color < 3; color++) {
                minCost[0][color] = (color == firstColor) ? cost[0][color] : INF;
            }
            for (int d = 1; d < N; d++) {
                minCost[d][RED] = Math.min(minCost[d - 1][GREEN], minCost[d - 1][BLUE]) + cost[d][RED];
                minCost[d][GREEN] = Math.min(minCost[d - 1][RED], minCost[d - 1][BLUE]) + cost[d][GREEN];
                minCost[d][BLUE] = Math.min(minCost[d - 1][RED], minCost[d - 1][GREEN]) + cost[d][BLUE];
            }
            for (int color = 0; color < 3; color++) {
                if (color != firstColor) {
                    answer = Math.min(answer, minCost[N - 1][color]);
                }
            }
        }
        System.out.println(answer);
    }
}