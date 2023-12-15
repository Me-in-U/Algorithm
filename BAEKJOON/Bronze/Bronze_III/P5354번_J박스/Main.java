package BAEKJOON.Bronze.Bronze_III.P5354번_J박스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int size = Integer.parseInt(br.readLine());
            if (size == 1) {
                sb.append('#').append("\n\n");
            } else {
                for (int j = 0; j < size; j++)
                    sb.append('#');
                sb.append('\n');
                if (size >= 3) {
                    for (int j = 0; j < size - 2; j++) {
                        sb.append('#');
                        for (int k = 0; k < size - 2; k++)
                            sb.append('J');
                        sb.append('#').append('\n');
                    }
                }
                for (int j = 0; j < size; j++)
                    sb.append('#');
                sb.append("\n\n");
            }
        }
        System.out.print(sb.toString().trim());
    }
}