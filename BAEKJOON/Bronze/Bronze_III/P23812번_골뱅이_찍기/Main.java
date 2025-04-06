package BAEKJOON.Bronze.Bronze_III.P23812번_골뱅이_찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder at__at = new StringBuilder();
        for (int i = 0; i < N; i++)
            at__at.append('@');
        for (int i = 0; i < 3 * N; i++)
            at__at.append(' ');
        for (int i = 0; i < N; i++)
            at__at.append('@');

        StringBuilder atatat = new StringBuilder();
        for (int i = 0; i < 5 * N; i++)
            atatat.append('@');

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++)
            result.append(at__at).append('\n');
        for (int i = 0; i < N; i++)
            result.append(atatat).append('\n');
        for (int i = 0; i < N; i++)
            result.append(at__at).append('\n');
        for (int i = 0; i < N; i++)
            result.append(atatat).append('\n');
        for (int i = 0; i < N; i++)
            result.append(at__at).append('\n');
        System.out.print(result.toString());
    }
}