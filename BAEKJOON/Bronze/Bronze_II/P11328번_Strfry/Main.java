package BAEKJOON.Bronze.Bronze_II.P11328번_Strfry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String[] strs = br.readLine().split(" ");
            boolean possible = true;
            if (strs[0].length() != strs[1].length()) {
                possible = false;
            } else {
                int[] count = new int[26];
                for (int i = 0; i < strs[0].length(); i++) {
                    count[strs[0].charAt(i) - 'a']++;
                }
                for (int i = 0; i < strs[1].length(); i++) {
                    if (count[strs[1].charAt(i) - 'a'] > 0) {
                        count[strs[1].charAt(i) - 'a']--;
                    } else {
                        possible = false;
                        break;
                    }
                }
            }
            sb.append(possible ? "Possible" : "Impossible").append('\n');
        }
        System.out.print(sb.toString());
    }
}