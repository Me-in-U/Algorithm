package Bronze_II.P13235번_팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            isPalindrome = str.charAt(i) == str.charAt(str.length() - 1 - i);
            if (!isPalindrome) {
                break;
            }
        }
        System.out.println(isPalindrome ? "true" : "false");
    }
}