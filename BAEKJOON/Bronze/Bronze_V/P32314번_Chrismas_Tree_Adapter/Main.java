package BAEKJOON.Bronze.Bronze_V.P32314번_Chrismas_Tree_Adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ampere = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int watt = Integer.parseInt(input[0]);
        int volt = Integer.parseInt(input[1]);
        System.out.println(ampere * volt <= watt ? "1" : "0");
    }
}