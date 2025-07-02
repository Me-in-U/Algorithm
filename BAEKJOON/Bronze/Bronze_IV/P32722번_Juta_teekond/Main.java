package BAEKJOON.Bronze.Bronze_IV.P32722번_Juta_teekond;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());
        int b = Integer.parseInt(br.readLine().trim());
        int c = Integer.parseInt(br.readLine().trim());

        if ((a == 1 || a == 3) && (b == 6 || b == 8) && (c == 2 || c == 5)) {
            System.out.println("JAH");
        } else {
            System.out.println("EI");
        }
    }
}
