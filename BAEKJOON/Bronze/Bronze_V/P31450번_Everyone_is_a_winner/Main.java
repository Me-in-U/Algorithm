package BAEKJOON.Bronze.Bronze_V.P31450번_Everyone_is_a_winner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MK = br.readLine().split(" ");
        System.out.println((Integer.parseInt(MK[0]) % Integer.parseInt(MK[1])) == 0 ? "Yes" : "No");
    }
}