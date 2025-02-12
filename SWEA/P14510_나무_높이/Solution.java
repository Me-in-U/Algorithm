package SWEA.P14510_나무_높이;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            int N = readInt();
            int maxHeight = 0;
            int[] height = new int[N];
            for (int i = 0; i < N; i++) {
                height[i] = readInt();
                if (maxHeight < height[i]) {
                    maxHeight = height[i];
                }
            }
            int height_1 = 0;
            int height_2 = 0;
            for (int i = 0; i < N; i++) {
                int diff = maxHeight - height[i];
                if (diff > 0) {
                    if (diff % 2 == 1)
                        height_1++;
                    height_2 += (diff / 2);
                }
            }
            int days = 0;
            int ones = 0;
            boolean isOdd = true;
            int set = Math.min(height_1, height_2);
            days += set * 2;
            height_1 -= set;
            height_2 -= set;
            while (height_1 != 0 || height_2 != 0) {
                days++;
                if (isOdd) {
                    if (height_1 > 0) {
                        height_1--;
                    } else {
                        if (++ones == 2) {
                            ones = 0;
                            if (height_2 > 0) {
                                height_2--;
                            }
                        }
                    }
                } else {
                    if (height_2 > 0) {
                        height_2--;
                    }
                }
                isOdd = !isOdd;
            }
            sb.append('#').append(t).append(' ').append(days).append('\n');
        }
        System.out.print(sb.toString());
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
