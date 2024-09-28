import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 샷건 {
    public static char[][] keys = new char[4][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            String input = br.readLine();
            for (int j = 0; j < 10; j++) {
                keys[i][j] = input.charAt(j);
            }
        }
        int minX = 11;
        int maxX = -1;
        int minY = 11;
        int maxY = -1;
        String input = br.readLine();
        for (int i = 0; i < 9; i++) {
            char c = input.charAt(i);
            int[] xy = findXY(c);
            minX = Math.min(minX, xy[0]);
            maxX = Math.max(maxX, xy[0]);
            minY = Math.min(minY, xy[1]);
            maxY = Math.max(maxY, xy[1]);
        }
        int targetX = (maxX == 1) ? 0 : (minX == 2) ? 3 : (minX + maxX) / 2;
        int targetY = (maxY == 1) ? 0 : (minY == 2) ? 3 : (minY + maxY) / 2;
        System.out.println(keys[targetX][targetY]);
    }

    public static int[] findXY(char c) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (keys[i][j] == c) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}