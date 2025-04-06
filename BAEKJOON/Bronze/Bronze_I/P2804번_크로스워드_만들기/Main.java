package BAEKJOON.Bronze.Bronze_I.P2804번_크로스워드_만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] AB = br.readLine().split(" ");
        int A_pos = 0;
        int B_pos = 0;
        boolean found = false;
        for (int temp_A = 0; temp_A < AB[1].length() && !found; temp_A++) {
            for (int temp_B = 0; temp_B < AB[1].length(); temp_B++) {
                if (AB[0].charAt(temp_A) == AB[1].charAt(temp_B)) {
                    found = true;
                    A_pos = temp_A;
                    B_pos = temp_B;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < AB[1].length(); i++) {
            if (i == B_pos)
                sb.append(AB[0]);
            else
                for (int j = 0; j < AB[0].length(); j++)
                    sb.append(j != A_pos ? '.' : AB[1].charAt(i));
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}