package BAEKJOON.Bronze.Bronze_II.P5293번_Diving_the_Pirate_Hoard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coins = Integer.parseInt(st.nextToken());
        int pirates = Integer.parseInt(st.nextToken());
        int[] coinsTaken = new int[pirates];
        for (int i = 0; i < pirates; i++) {
            int coinsPerPirate = coins / pirates;
            int remainingCoins = coins % pirates;
            coinsTaken[i] = coinsPerPirate + remainingCoins;
            coins -= coinsTaken[i];
        }
        Arrays.sort(coinsTaken);
        for (int i = pirates - 1; i >= 0; i--)
            sb.append(coinsTaken[i]).append(' ');
        sb.append('\n').append(coins);
        System.out.print(sb.toString());
    }
}
