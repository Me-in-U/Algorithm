package BAEKJOON.Bronze.Bronze_III.P20540번_연길이의_이상형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] mbti = br.readLine().toCharArray();
        sb.append(mbti[0] == 'E' ? 'I' : 'E').append(mbti[1] == 'S' ? 'N' : 'S')
                .append(mbti[2] == 'T' ? 'F' : 'T').append(mbti[3] == 'J' ? 'P' : 'J');
        System.out.print(sb.toString());
    }
}