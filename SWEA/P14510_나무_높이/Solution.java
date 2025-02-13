package SWEA.P14510_나무_높이;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        // 나무는 최대 100개
        int[] height = new int[100];
        for (int t = 1; t <= T; t++) {
            // 이번 Test case의 나무 개수 N
            int N = readInt();
            int maxHeight = 0;
            for (int i = 0; i < N; i++) {
                height[i] = readInt();
                if (maxHeight < height[i]) {
                    maxHeight = height[i];
                }
            }
            // 물을 몇번 줘야 모두 최대나무의 높이와 같아지는지 카운트
            // height_1 물 (odd day 1번 - 높이 1 자람) 줘야하는 카운트
            // height_2 물 (even day 1번 - 높이 2 자람) 혹은 (odd day 2번 - 높이 1만큼 2번 자람) 줘야하는 카운트
            int height_1 = 0;
            int height_2 = 0;
            for (int i = 0; i < N; i++) {
                int diff = maxHeight - height[i];
                if (diff > 0) {
                    if (diff % 2 == 1)
                        height_1++;
                    height_2 += (diff >> 1); // 나누기 2
                }
            }
            int days = 0;
            // set는 odd day(높이 1 자랄 때), even day(높이 2 자랄 때) 묶음 개수
            // 즉, 1set는 2일
            int set = (height_1 <= height_2) ? height_1 : height_2; // Math.min(height_1, height_2)
            days += set << 1; // 곱하기 2
            // set를 빼주면 전부 0이거나 둘 중 하나만 0이 됨
            height_1 -= set;
            height_2 -= set;

            boolean oneStored = false;
            boolean isOddDay = true;
            // 높이 1만 자라면 되는 나무만 남았으면
            if (height_1 != 0 && height_2 == 0) {
                // 높이 1만 자라야 하면 odd day에만 가능하니 * 2
                // 마지막 날의 even day일때는 포함 안되니 -1
                days += (height_1 << 1); // 곱하기 2
                days--;
            } // (even day 1번 - 높이 2만큼 자람) 혹은 (odd day 2번 - 높이 1만큼 2번 자람) 줘야하는 나무만 남았으면
            else if (height_1 == 0 && height_2 != 0) {
                while (height_2 != 0) {
                    // odd day에는 물을 저장할 수 있음 - 나중에 2번 한번에 준다고 생각
                    // odd day 이전에 저장한 물이 있으면 높이 2 자랄 카운트 차감
                    if (isOddDay) {
                        if (oneStored) {
                            oneStored = false;
                            height_2--;
                        } else {
                            oneStored = true;
                        }
                    } // even day는 높이 2 자라는 물 주는 날
                    else {
                        height_2--;
                    }
                    // 하루 추가
                    days++;
                    isOddDay = !isOddDay;
                }
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
