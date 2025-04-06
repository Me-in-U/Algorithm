package BAEKJOON.Bronze.Bronze_I.P17363번_우유가_넘어지면;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] change = new char[125];
        change[46] = '.';
        change[79] = 'O';
        change[45] = '|';
        change[124] = '-';
        change[47] = '\\';
        change[92] = '/';
        change[94] = '<';
        change[60] = 'v';
        change[118] = '>';
        change[62] = '^';
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        StringBuilder[] sb = new StringBuilder[M];
        for (int i = 0; i < M; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                sb[M - 1 - j].append(change[str.charAt(j)]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            result.append(sb[i]).append('\n');
        }
        System.out.print(result.toString());
    }
}