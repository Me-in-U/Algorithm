package P17136번_색종이_붙이기;

/**
 * =
 * <h1>BAEKJOON 17136번 색종이 붙이기</h1>
 * <p>
 * JAVA 8 : 메모리 15,548KB, 시간 188ms <br>
 * JAVA11 : 메모리 18,052KB, 시간 168ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-02
 */

import java.io.IOException;

public class Main_B_17136_색종이붙이기_김민규 {
    private static int[] paper = new int[10];
    private static int totalOnes;
    private static int min = 26;

    public static void main(String[] args) throws IOException {
        // 입력
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (readInt() == 1) {
                    paper[i] |= (1 << j);
                    totalOnes++;
                }
            }
        }

        // backtracking
        dfs(0, 0, 5, 5, 5, 5, 5);
        System.out.println(min == 26 ? "-1" : min);
    }

    private static void dfs(int xyTemp, int ones, int _1x1, int _2x2, int _3x3, int _4x4, int _5x5) {
        if (ones == totalOnes) {
            min = Math.min(min, 25 - _1x1 - _2x2 - _3x3 - _4x4 - _5x5);
            return;
        }
        if (min <= 25 - _1x1 - _2x2 - _3x3 - _4x4 - _5x5) {
            return;
        }
        for (int xy = xyTemp; xy < 100; xy++) {
            int x = xy / 10;
            int y = xy % 10;
            if ((paper[x] & (1 << y)) != 0) {
                for (int size = 5; size >= 1; size--) {
                    if (colorPaperCheck(size, _1x1, _2x2, _3x3, _4x4, _5x5) && x + size <= 10 && y + size <= 10
                            && checkSquare(x, y, size)) {
                        makeUsed(x, y, size);
                        dfs(xy, ones + size * size, _1x1 - (size == 1 ? 1 : 0), _2x2 - (size == 2 ? 1 : 0),
                                _3x3 - (size == 3 ? 1 : 0), _4x4 - (size == 4 ? 1 : 0), _5x5 - (size == 5 ? 1 : 0));
                        makeNotUsed(x, y, size);
                    }
                }
                return;
            }
        }
    }

    private static boolean colorPaperCheck(int size, int _1x1, int _2x2, int _3x3, int _4x4, int _5x5) {
        switch (size) {
        case 1:
            return _1x1 > 0;
        case 2:
            return _2x2 > 0;
        case 3:
            return _3x3 > 0;
        case 4:
            return _4x4 > 0;
        case 5:
            return _5x5 > 0;
        default:
            return false;
        }
    }

    private static boolean checkSquare(int x, int y, int size) {
        int mask = ((1 << size) - 1) << y;
        for (int i = x; i < x + size; i++)
            if ((paper[i] & mask) != mask)
                return false;
        return true;
    }

    private static void makeUsed(int x, int y, int size) {
        int mask = ((1 << size) - 1) << y;
        for (int i = x; i < x + size; i++)
            paper[i] &= ~mask;
    }

    private static void makeNotUsed(int x, int y, int size) {
        int mask = ((1 << size) - 1) << y;
        for (int i = x; i < x + size; i++)
            paper[i] |= mask;
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
