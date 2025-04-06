package BAEKJOON.Bronze.Bronze_III.P14264번_정육각형과_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println((Math.sqrt(3) / 4)
                * Math.pow(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()), 2));
    }
}