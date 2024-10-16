package P6996번_애너그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] words = br.readLine().split(" ");
            if (words[0].length() != words[1].length()) {
                sb.append(words[0]).append(" & ").append(words[1]).append(" are NOT anagrams.").append('\n');
                continue;
            }
            int[] count = new int[26];
            boolean isAnagram = true;
            for (int i = 0; i < words[0].length(); i++)
                count[words[0].charAt(i) - 'a']++;
            for (int i = 0; i < words[1].length(); i++) {
                if (--count[words[1].charAt(i) - 'a'] < 0) {
                    isAnagram = false;
                    break;
                }
            }
            sb.append(words[0]).append(" & ").append(words[1])
                    .append(isAnagram ? " are" : " are NOT").append(" anagrams.").append('\n');
        }
        System.out.print(sb.toString());
    }
}