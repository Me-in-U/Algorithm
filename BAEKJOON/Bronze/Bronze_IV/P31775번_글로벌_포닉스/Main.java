package BAEKJOON.Bronze.Bronze_IV.P31775번_글로벌_포닉스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s1 = br.readLine().charAt(0);
        char s2 = br.readLine().charAt(0);
        char s3 = br.readLine().charAt(0);
        boolean isL = s1 == 'l' || s2 == 'l' || s3 == 'l';
        boolean isK = s1 == 'k' || s2 == 'k' || s3 == 'k';
        boolean isP = s1 == 'p' || s2 == 'p' || s3 == 'p';
        System.out.println(isL && isK && isP ? "GLOBAL" : "PONIX");
    }
}