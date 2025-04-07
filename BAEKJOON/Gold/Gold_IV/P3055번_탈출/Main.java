package BAEKJOON.Gold.Gold_IV.P3055번_탈출;

/**
 * <h1>BAEKJOON 3055번 탈출</h1>
 * <p>
 * JAVA11 : 메모리 14,212KB, 시간 108ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-07
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static boolean reached = false;
    private static boolean[][] visited;
    private static char[][] map;
    private static Deque<Position> hedgehog;
    private static Deque<Position> water;
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };
    private static int R, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);
        map = new char[R][C];
        visited = new boolean[R][C];
        hedgehog = new ArrayDeque<>();
        water = new ArrayDeque<>();
        for (int i = 0; i < R; i++) {
            String inputString = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = inputString.charAt(j);
                // 고슴도치의 위치 방문처리
                if (map[i][j] == 'S') {
                    hedgehog.add(new Position(i, j));
                    visited[i][j] = true;
                } // 물이 차있는 지역 방문처리
                else if (map[i][j] == '*') {
                    water.add(new Position(i, j));
                    visited[i][j] = true;
                } // 돌 위치 방문처리
                else if (map[i][j] == 'X') {
                    visited[i][j] = true;
                }
            }
        }
        int time = 0;
        while (!reached) {
            if (!BFS())
                break;
            time++;
        }
        System.out.println(reached ? time : "KAKTUS");
    }

    private static boolean BFS() {
        Deque<Position> temp = new ArrayDeque<>();
        while (!water.isEmpty()) {
            Position pos = water.poll();
            for (int i = 0; i < 4; i++) {
                int x = pos.x + dx[i];
                int y = pos.y + dy[i];
                if (0 <= x && x < R && 0 <= y && y < C) {
                    // 방문한적이 아닌 곳 && 비버굴이 아니면
                    if (!visited[x][y] && map[x][y] != 'D') {
                        visited[x][y] = true;
                        temp.add(new Position(x, y));
                    }
                }
            }
        }
        water.addAll(temp);
        temp.clear();
        while (!hedgehog.isEmpty()) {
            Position pos = hedgehog.poll();
            for (int i = 0; i < 4; i++) {
                int x = pos.x + dx[i];
                int y = pos.y + dy[i];
                if (0 <= x && x < R && 0 <= y && y < C) {
                    // 비버의 굴 도착
                    if (map[x][y] == 'D') {
                        reached = true;
                        return true;
                    } // 이전 방문한적 없는 곳
                    else if (!visited[x][y]) {
                        visited[x][y] = true;
                        temp.add(new Position(x, y));
                    }
                }
            }
        }
        return hedgehog.addAll(temp);
    }
}