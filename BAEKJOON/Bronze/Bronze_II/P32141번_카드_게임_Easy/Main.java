package P32141번_카드_게임_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hp = Integer.parseInt(br.readLine().split(" ")[1]);
        int[] cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < cards.length; i++) {
            hp -= cards[i];
            if (hp <= 0) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}