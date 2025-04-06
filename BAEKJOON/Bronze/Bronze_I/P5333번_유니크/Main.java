package BAEKJOON.Bronze.Bronze_I.P5333번_유니크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int GAME_COUNT = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int[][] numbers = new int[N][GAME_COUNT];
        int[][] numbersCount = new int[GAME_COUNT][101];
        for (int person = 0; person < N; person++) {
            st = new StringTokenizer(br.readLine());
            for (int game = 0; game < GAME_COUNT; game++) {
                int score = Integer.parseInt(st.nextToken());
                numbers[person][game] = score;
                numbersCount[game][score]++;
            }
        }
        int[] scores = new int[N];
        for (int person = 0; person < N; person++)
            for (int game = 0; game < GAME_COUNT; game++)
                if (numbersCount[game][numbers[person][game]] == 1)
                    scores[person] += numbers[person][game];
        for (int i = 0; i < N; i++)
            sb.append(scores[i]).append('\n');
        System.out.print(sb.toString());
    }
}