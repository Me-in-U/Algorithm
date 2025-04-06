package BAEKJOON.Bronze.Bronze_II.P16171번_나는_친구가_적다_Small;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().replaceAll("[0-9]", "");
        String keyword = br.readLine();
        System.out.print(input.contains(keyword) ? "1" : "0");
    }
}