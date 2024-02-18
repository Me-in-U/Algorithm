package BAEKJOON.Bronze.Bronze_IV.P31428번_엘리스_트랙_매칭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String input = br.readLine();
        char helloBit = br.readLine().charAt(0);
        long count = Arrays.stream(input.split(" "))
                .filter(s -> s.charAt(0) == helloBit)
                .count();
        System.out.println(count);
    }
}