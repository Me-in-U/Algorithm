package P10804번_카드_역배치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] card = new int[21];
        for (int i = 0; i < 21; i++) {
            card[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int temp = 0;
            for (int j = 0; j < (b - a + 1) / 2; j++) {
                temp = card[a + j];
                card[a + j] = card[b - j];
                card[b - j] = temp;
            }
        }
        for (int i = 1; i < 21; i++) {
            sb.append(card[i]).append(' ');
        }
        System.out.println(sb);
    }
}