package BAEKJOON.Bronze.Bronze_IV.P31746번_SciComLove_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(br.readLine()) % 2 == 0 ? "SciComLove" : "evoLmoCicS");
    }
}