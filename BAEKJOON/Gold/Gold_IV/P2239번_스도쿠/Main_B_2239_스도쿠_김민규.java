package BAEKJOON.Gold.Gold_IV.P2239번_스도쿠;

/**
 * BAEKJOON 2239번 스도쿠
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-05 JAVA8 : 메모리 14,404 KB, 시간 352ms
 * @since 2025-03-05 JAVA11 : 메모리 18,264 KB, 시간 388ms
 */

import java.io.IOException;

public class Main_B_2239_스도쿠_김민규 {
    private static int[][] board = new int[9][9]; // 스도쿠 판
    private static int[] rowBit = new int[9]; // 가로 행 1 ~ 9 존재여부
    private static int[] colBit = new int[9]; // 세로 열 1 ~ 9 존재여부
    private static int[] boxBit = new int[9]; // 3 * 3 박스 1 ~ 9 존재 여부
    // 박스 인덱스
    // 1,2,3
    // 4,5,6
    // 7,8,9
    private static int[] bitData = new int[10]; // 1 ~ 9를 비트로 미리 저장

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        bitData[1] = 2;
        for (int i = 2; i < 10; i++) {
            bitData[i] = bitData[i - 1] << 1;
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = readInt();
                board[i][j] = num;
                rowBit[i] |= bitData[num];
                colBit[j] |= bitData[num];
                int boxIdx = (i / 3) * 3 + (j / 3);
                boxBit[boxIdx] |= bitData[num];
            }
        }

        // 풀이
        solve(0);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int[] row : board) {
            for (int num : row)
                sb.append(num);
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static boolean solve(int count) {
        // 마지막 칸 까지 가면 return
        if (count == 81)
            return true;

        // x, y좌표 확인
        int x = count / 9;
        int y = count % 9;

        // 아직 숫자가 채워지지 않았다면
        if (board[x][y] == 0) {
            int boxIdx = (x / 3) * 3 + (y / 3);
            // 1 ~ 9까지 다 넣어봄
            for (int num = 1; num <= 9; num++) {
                int mask = bitData[num];
                // 세로 가로 박스에 num이 없으면 진행
                if ((rowBit[x] & mask) == 0 && (colBit[y] & mask) == 0 && (boxBit[boxIdx] & mask) == 0) {
                    // 숫자 넣기
                    board[x][y] = num;
                    rowBit[x] |= mask;
                    colBit[y] |= mask;
                    boxBit[boxIdx] |= mask;

                    // 다음 칸
                    if (solve(count + 1))
                        return true;

                    // 복구
                    board[x][y] = 0;
                    rowBit[x] ^= mask;
                    colBit[y] ^= mask;
                    boxBit[boxIdx] ^= mask;
                }
            }
            return false;
        } else {
            // 숫자가 이미 있으면 다음 칸
            return solve(count + 1);
        }
    }

    // 공백없는숫자빨리읽어버리기
    private static int readInt() throws IOException {
        int c = System.in.read();
        while (c == '\r' || c == '\n') {
            c = System.in.read();
        }
        return c & 15;
    }
}
