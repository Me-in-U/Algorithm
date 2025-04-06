package BAEKJOON.Bronze.Bronze_IV.P20336번_Haughty_Cuisine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] menuList = new String[N][];
        for (int i = 0; i < N; i++) {
            menuList[i] = br.readLine().split(" ");
        }
        for (String menu : menuList[0]) {
            System.out.println(menu);
        }
    }
}
