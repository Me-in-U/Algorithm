package P32247번_이상한_나라의_끈끈이주걱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[][] data = new int[N + 1][2];
        boolean[] exist = new boolean[N + 1];
        while (M-- > 0) {
            input = br.readLine().split(" ");
            int isDown = Integer.parseInt(input[0]);
            int stickyX = Integer.parseInt(input[1]);
            int stickyY = Integer.parseInt(input[2]);
            data[stickyX][0] = isDown;
            data[stickyX][1] = stickyY;
            exist[stickyX] = true;
        }
        data[N][0] = 0;
        data[N][1] = -1;
        exist[N] = true;
        boolean able = true;
        int flyY = 0;
        for (int stickyX = 1; stickyX <= N; stickyX++) {
            if (exist[stickyX]) {
                int isDown = data[stickyX][0];
                int stickyY = data[stickyX][1];
                if (isDown == 0) {
                    if (flyY <= stickyY) {
                        flyY = stickyY + 1;
                    } else if (flyY - 1 > stickyY) {
                        flyY--;
                    }
                } else {
                    flyY--;
                    if (flyY >= stickyY) {
                        able = false;
                        break;
                    }
                }
            } else {
                flyY--;
            }
        }
        if (flyY != 0) {
            able = false;
        }
        System.out.println(able ? "stay" : "adios");
    }
}