package P25501번_재귀의_귀재;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int recursionCount;
    static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            S = br.readLine();
            recursionCount = 0;
            sb.append(isPalindrome(0, S.length() - 1)).append(' ').append(recursionCount).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static int isPalindrome(int r, int l) {
        recursionCount++;
        if (r >= l) {
            return 1;
        } else if (S.charAt(r) != S.charAt(l)) {
            return 0;
        } else {
            return isPalindrome(r + 1, l - 1);
        }
    }
}