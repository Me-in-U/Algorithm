package BAEKJOON.Gold.Gold_IV.P6784번_Multiful_Choice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        char[] student = new char[N];
        char[] answer = new char[N];

        for (int i = 0; i < N; i++)
            student[i] = br.readLine().charAt(0);
        for (int i = 0; i < N; i++)
            answer[i] = br.readLine().charAt(0);

        int count = 0;
        for (int i = 0; i < N; i++)
            if (student[i] == answer[i])
                count++;

        System.out.println(count);
    }
}
