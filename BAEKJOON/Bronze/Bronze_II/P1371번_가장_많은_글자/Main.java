package P1371번_가장_많은_글자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        String line = null;
        while ((line = br.readLine()) != null) {
            for (char i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if ('a' <= c) {
                    count[c - 'a']++;
                }
            }
        }
        int maxCount = -1;
        StringBuilder sb = new StringBuilder();
        for (char i = 0; i < 26; i++) {
            if (maxCount < count[i]) {
                maxCount = count[i];
                sb.setLength(0);
                sb.append((char) (i + 'a'));
            } else if (maxCount == count[i]) {
                sb.append((char) (i + 'a'));
            }
        }
        System.out.println(sb.toString());
    }
}