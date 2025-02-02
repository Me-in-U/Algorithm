package P9626번_크로스워드_퍼즐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int U = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);
        int D = Integer.parseInt(input[3]);
        String[] data = new String[M];
        for (int i = 0; i < M; i++) {
            data[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        // !상단 U
        for (int i = 0; i < U; i++) {
            for (int j = 0; j < (L + N + R); j++) {
                if (i % 2 == 0) {
                    sb.append(j % 2 == 0 ? '#' : '.');
                } else {
                    sb.append(j % 2 == 0 ? '.' : '#');
                }
            }
            sb.append('\n');
        }
        // !중간 M
        for (int i = 0; i < M; i++) {
            // !좌 L
            for (int j = 0; j < L; j++) {
                if ((U + i) % 2 == 0) {
                    sb.append(j % 2 == 0 ? '#' : '.');
                } else {
                    sb.append(j % 2 == 0 ? '.' : '#');
                }
            }
            // !글자
            sb.append(data[i]);
            // !오른쪽 R
            for (int j = 0; j < R; j++) {
                if ((U + i) % 2 == 0) {
                    sb.append((L + N + j) % 2 == 0 ? '#' : '.');
                } else {
                    sb.append((L + N + j) % 2 == 0 ? '.' : '#');
                }
            }
            sb.append('\n');
        }
        // !하단 D
        for (int i = 0; i < D; i++) {
            for (int j = 0; j < (L + N + R); j++) {
                if ((U + M + i) % 2 == 0) {
                    sb.append(j % 2 == 0 ? '#' : '.');
                } else {
                    sb.append(j % 2 == 0 ? '.' : '#');
                }
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}