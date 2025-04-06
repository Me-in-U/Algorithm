package BAEKJOON.Bronze.Bronze_IV.P31635번_Three_Conxecutive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        if (N < 3) {
            System.out.println("No");
            return;
        }
        int hash = 333;
        int currentHash = line.charAt(0) + line.charAt(1) + line.charAt(2);
        boolean found = hash == currentHash;
        if (found) {
            System.out.println("Yes");
            return;
        }
        for (int i = 1; i < N - 2; i++) {
            if (line.charAt(i - 1) != line.charAt(i + 2)) {
                currentHash -= line.charAt(i - 1);
                currentHash += line.charAt(i + 2);
                if (hash == currentHash) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found ? "Yes" : "No");
    }
}