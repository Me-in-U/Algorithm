package P1873번_상호의_배틀필드;

/**
 * SW Expert Academy 1873번 상호의 배틀필드 D3
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-26 JAVA8 : 메모리 25,728 KB, 시간 81ms
 */

import java.io.IOException;

public class Solution_1837_상호의배틀필드_김민규 {
    private static int H;
    private static int W;
    private static int nowX;
    private static int nowY;
    private static char[][] battleField;
    private static int direction;
    private static char[] heading = { '^', 'v', '<', '>' };
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            H = readInt();
            W = readInt();
            nowX = -1;
            nowY = -1;
            battleField = new char[H][W];
            direction = -1; // 0:상, 1:하, 2:좌, 3:우
            for (int x = 0; x < H; x++) {
                int c;
                for (int y = 0; y < W; y++) {
                    c = System.in.read();
                    if (c == '^') { // 0:상
                        nowX = x;
                        nowY = y;
                        direction = 0;
                    } else if (c == 'v') { // 1:하
                        nowX = x;
                        nowY = y;
                        direction = 1;
                    } else if (c == '<') { // 2:좌
                        nowX = x;
                        nowY = y;
                        direction = 2;
                    } else if (c == '>') { // 3:우
                        nowX = x;
                        nowY = y;
                        direction = 3;
                    }
                    battleField[x][y] = (char) c;
                }
                if (System.in.read() == 13)
                    System.in.read();
            }
            int N = readInt();
            byte[] commands = new byte[N + 2];
            System.in.read(commands);

            // 명령 수행
            for (int j = 0; j < N; j++) {
                char command = (char) commands[j];
                // 위로 움직이기
                if (command == 'U') {
                    direction = 0;
                    int nextX = nowX + dx[direction];
                    if (0 <= nextX && battleField[nextX][nowY] == '.') {
                        battleField[nowX][nowY] = '.';
                        nowX = nextX;
                    }
                } // 아래로 움직이기
                else if (command == 'D') {
                    direction = 1;
                    int nextX = nowX + dx[direction];
                    if (nextX < H && battleField[nextX][nowY] == '.') {
                        battleField[nowX][nowY] = '.';
                        nowX = nextX;
                    }
                } // 왼쪽으로 움직이기
                else if (command == 'L') {
                    direction = 2;
                    int nextY = nowY + dy[direction];
                    if (0 <= nextY && battleField[nowX][nextY] == '.') {
                        battleField[nowX][nowY] = '.';
                        nowY = nextY;
                    }
                } // 오른쪽으로 움직이기
                else if (command == 'R') {
                    direction = 3;
                    int nextY = nowY + dy[direction];
                    if (nextY < W && battleField[nowX][nextY] == '.') {
                        battleField[nowX][nowY] = '.';
                        nowY = nextY;
                    }
                } // 대포쏘기
                else if (command == 'S') {
                    int nextX = nowX + dx[direction];
                    int nextY = nowY + dy[direction];
                    // 위를 보고 있으면
                    if (direction == 0) {
                        while (0 <= nextX) {
                            char c = battleField[nextX][nowY];
                            if (c == '*') {
                                battleField[nextX][nowY] = '.';
                                break;
                            } else if (c == '#') {
                                break;
                            }
                            nextX--;
                        }
                    } // 아래를 보고 있으면
                    else if (direction == 1) {
                        while (nextX < H) {
                            char c = battleField[nextX][nowY];
                            if (c == '*') {
                                battleField[nextX][nowY] = '.';
                                break;
                            } else if (c == '#') {
                                break;
                            }
                            nextX++;
                        }
                    } // 왼쪽를 보고 있으면
                    else if (direction == 2) {
                        while (0 <= nextY) {
                            char c = battleField[nowX][nextY];
                            if (c == '*') {
                                battleField[nowX][nextY] = '.';
                                break;
                            } else if (c == '#') {
                                break;
                            }
                            nextY--;
                        }
                    } // 오른쪽를 보고 있으면
                    else if (direction == 3) {
                        while (nextY < W) {
                            char c = battleField[nowX][nextY];
                            if (c == '*') {
                                battleField[nowX][nextY] = '.';
                                break;
                            } else if (c == '#') {
                                break;
                            }
                            nextY++;
                        }
                    }
                }
            }

            // 출력
            battleField[nowX][nowY] = heading[direction];
            sb.append("#").append(t).append(" ");
            for (int x = 0; x < H; x++) {
                for (int y = 0; y < W; y++) {
                    sb.append(battleField[x][y]);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
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
