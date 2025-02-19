package SWEA.P6808번_규영이와_인영이의_카드게임;

import java.io.IOException;

public class Solution {
    private static int[] gyu0Card;
    private static int[] in0Card;
    private static boolean[] usedCards;
    private static int gyu0Win;
    private static int in0Win;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            gyu0Card = new int[10];
            in0Card = new int[10];
            usedCards = new boolean[19];
            gyu0Win = 0;
            in0Win = 0;
            for (int i = 1; i <= 9; i++) {
                int card = readInt();
                gyu0Card[i] = card;
                usedCards[card] = true;
            }
            for (int i = 1, temp = 1; i <= 18; i++)
                if (!usedCards[i])
                    in0Card[temp++] = i;
            for (int i = 1; i <= 18; i++)
                usedCards[i] = false;
            dfs(1, 0, 0);
            sb.append('#').append(t).append(' ').append(gyu0Win).append(' ').append(in0Win).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static void dfs(int cnt, int gyu0Score, int in0Score) {
        if (cnt == 10) {
            if (gyu0Score > in0Score)
                gyu0Win++;
            else if (gyu0Score < in0Score)
                in0Win++;
            return;
        }
        for (int in0Select = 1; in0Select <= 9; in0Select++) {
            if (!usedCards[in0Select]) {
                usedCards[in0Select] = true;
                int sum = gyu0Card[cnt] + in0Card[in0Select];
                if (gyu0Card[cnt] > in0Card[in0Select]) {
                    dfs(cnt + 1, (gyu0Score + sum), in0Score);
                } else {
                    dfs(cnt + 1, gyu0Score, (in0Score + sum));
                }
                usedCards[in0Select] = false;
            }
        }
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
