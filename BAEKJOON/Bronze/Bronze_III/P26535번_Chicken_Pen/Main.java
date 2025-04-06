package BAEKJOON.Bronze.Bronze_III.P26535번_Chicken_Pen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chickens = Integer.parseInt(br.readLine());
        int sideLength = 1;
        while (chickens > sideLength * sideLength) {
            sideLength++;
        }
        StringBuilder output = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        for (int i = 0; i < sideLength + 2; i++) {
            output.append('x');
        }
        mid.append('x');
        for (int i = 0; i < sideLength; i++) {
            mid.append('.');
        }
        mid.append('x');
        output.append('\n');
        for (int i = 0; i < sideLength; i++) {
            output.append(mid).append('\n');
        }
        for (int i = 0; i < sideLength + 2; i++) {
            output.append('x');
        }
        System.out.print(output.toString());
    }
}