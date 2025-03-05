package SWEA.P6109번_추억의_2048게임;

/**
 * SWEA 6109번 추억의 2048게임
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-05 JAVA8 : 메모리 29,312 KB, 시간 115ms
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_6109_추억의2048게임_김민규 {
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            int N = readInt();
            int[][] board = new int[N][N];
            char direction = (char) System.in.read();
            while (System.in.read() != '\n')
                ;
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    board[i][j] = readInt();

            // 풀이 시작
            int[][] newBoard = solve(board, direction, N);

            // 출력
            sb.append("#").append(t).append("\n");
            for (int[] line : newBoard) {
                for (int num : line) {
                    sb.append(num).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }

    private static int[][] solve(int[][] board, char direction, int N) {
        // 밀린 후 보드
        int[][] newBoard = new int[N][N];

        // 위로 밀어버린다면
        if (direction == 'u') {
            for (int y = 0; y < N; y++) {
                // 추가될 숫자 Index
                int addIndex = 0;
                // 위로 밀면 세로줄 숫자들끼리 합쳐지기때문에
                // 세로 한줄 큐에 넣음
                Deque<Integer> deque = new ArrayDeque<>();
                for (int x = 0; x < N; x++) {
                    deque.add(board[x][y]);
                }
                // 모든 숫자를 쓸때까지 반복
                while (!deque.isEmpty()) {
                    // 비교할 숫자 2개
                    int d1 = -1;
                    int d2 = -1;
                    // 0은 무시
                    if (clearZero(deque)) {
                        // 숫자가 남으면 하나 빼옴
                        d1 = deque.pollFirst();
                    } else {
                        break;
                    }
                    // 0은 무시
                    if (clearZero(deque)) {
                        // 숫자가 남으면 하나 빼옴
                        d2 = deque.pollFirst();
                    } else {
                        // d1에 숫자가 혼자 남으면 그거만 새로운 보드에 추가
                        newBoard[addIndex][y] = d1;
                        break;
                    }

                    // 숫자 2개가 같으면 합쳐짐
                    if (d1 == d2) {
                        newBoard[addIndex++][y] = d1 << 1;
                    } // 숫자 2개가 다르면 처음 빼온거만 보드에 넣고
                      // 두번째 숫자는 다시 큐앞에 넣음
                    else {
                        newBoard[addIndex++][y] = d1;
                        deque.addFirst(d2);
                    }
                }
            }
        } // 나머지 방향도 동일한 방식
        else if (direction == 'd') {
            for (int y = 0; y < N; y++) {
                int addIndex = N - 1;
                Deque<Integer> deque = new ArrayDeque<>();
                for (int x = N - 1; x >= 0; x--) {
                    deque.add(board[x][y]);
                }
                while (!deque.isEmpty()) {
                    int d1 = -1;
                    int d2 = -1;
                    if (clearZero(deque)) {
                        d1 = deque.pollFirst();
                    } else {
                        break;
                    }
                    if (clearZero(deque)) {
                        d2 = deque.pollFirst();
                    } else {
                        newBoard[addIndex][y] = d1;
                        break;
                    }
                    if (d1 == d2) {
                        newBoard[addIndex--][y] = d1 << 1;
                    } else {
                        newBoard[addIndex--][y] = d1;
                        deque.addFirst(d2);
                    }
                }
            }
        } else if (direction == 'l') {
            for (int x = 0; x < N; x++) {
                int addIndex = 0;
                Deque<Integer> deque = new ArrayDeque<>();
                for (int y = 0; y < N; y++) {
                    deque.add(board[x][y]);
                }
                while (!deque.isEmpty()) {
                    int d1 = -1;
                    int d2 = -1;
                    if (clearZero(deque)) {
                        d1 = deque.pollFirst();
                    } else {
                        break;
                    }
                    if (clearZero(deque)) {
                        d2 = deque.pollFirst();
                    } else {
                        newBoard[x][addIndex] = d1;
                        break;
                    }
                    if (d1 == d2) {
                        newBoard[x][addIndex++] = d1 << 1;
                    } else {
                        newBoard[x][addIndex++] = d1;
                        deque.addFirst(d2);
                    }
                }
            }
        } else if (direction == 'r') {
            for (int x = 0; x < N; x++) {
                int addIndex = N - 1;
                Deque<Integer> deque = new ArrayDeque<>();
                for (int y = N - 1; y >= 0; y--) {
                    deque.add(board[x][y]);
                }
                while (!deque.isEmpty()) {
                    int d1 = -1;
                    int d2 = -1;
                    if (clearZero(deque)) {
                        d1 = deque.pollFirst();
                    } else {
                        break;
                    }
                    if (clearZero(deque)) {
                        d2 = deque.pollFirst();
                    } else {
                        newBoard[x][addIndex] = d1;
                        break;
                    }
                    if (d1 == d2) {
                        newBoard[x][addIndex--] = d1 << 1;
                    } else {
                        newBoard[x][addIndex--] = d1;
                        deque.addFirst(d2);
                    }
                }
            }
        }
        return newBoard;
    }

    /**
     * 큐 맨앞에 0이 있으면 제거
     * 
     * @param deque
     * @return boolean 큐가 비었으면 false, 뭐라도 있으면 true
     */
    private static boolean clearZero(Deque<Integer> deque) {
        while (!deque.isEmpty() && deque.peek() == 0) {
            deque.pollFirst();
        }
        return !deque.isEmpty();
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
