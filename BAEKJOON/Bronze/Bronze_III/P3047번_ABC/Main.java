package BAEKJOON.Bronze.Bronze_III.P3047번_ABC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        String ABC = br.readLine();
        for (int i = 0; i < 3; i++) {
            System.out.print(data[ABC.charAt(i) - 'A']);
            System.out.print(' ');
        }
    }
}
