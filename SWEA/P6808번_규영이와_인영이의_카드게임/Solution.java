package SWEA.P6808번_규영이와_인영이의_카드게임;

/**
 * SWEA
 * 6808. 규영이와 인영이의 카드게임
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-19
 */

import java.io.IOException;

public class Solution {
    // 규영이와 인영이의 카드 배열
    private static int[] gyu0Card;
    private static int[] in0Card;
    // 사용된 카드 확인용 배열
    private static boolean[] usedCards;
    // 승리 횟수
    private static int gyu0Win;
    private static int in0Win;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // T번 반복(테스트 케이스 수)
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 변수 입력 및 초기화
            gyu0Card = new int[10];
            in0Card = new int[10];
            usedCards = new boolean[19];
            gyu0Win = 0;
            in0Win = 0;
            // 규영이 카드
            for (int i = 1; i <= 9; i++) {
                int card = readInt();
                gyu0Card[i] = card;
                usedCards[card] = true;
            }
            // 인영이 카드
            for (int i = 1, temp = 1; i <= 18; i++)
                if (!usedCards[i])
                    in0Card[temp++] = i;
            // 사용된 카드 초기화
            for (int i = 1; i <= 18; i++)
                usedCards[i] = false;
            // dfs시작
            dfs(1, 0, 0);
            // 출력
            sb.append('#').append(t).append(' ').append(gyu0Win).append(' ').append(in0Win).append('\n');
        }
        System.out.print(sb.toString());
    }

    /**
     * 
     * @param cnt       게임 라운드 수, 규영가 낼 카드 index
     * @param gyu0Score 규영 점수
     * @param in0Score  인영 점수
     */
    public static void dfs(int cnt, int gyu0Score, int in0Score) {
        // 9번 비교가 끝나면 점수가 높은사람 win 증가
        if (cnt == 10) {
            if (gyu0Score > in0Score)
                gyu0Win++;
            else if (gyu0Score < in0Score)
                in0Win++;
            return;
        }
        // 규영이 카드와 인영이 카드를 비교
        // 무승부는 존재하지 않는다
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
