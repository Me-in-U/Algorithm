package P16916번_부분_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    protected static final int MOD = 1_000_000_007;
    protected static final int BASE = 31;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String pattern = br.readLine();

        if (line.length() < pattern.length()) {
            System.out.println(0);
            return;
        }

        int patternLength = pattern.length();
        int lineLength = line.length();
        long power = 1;

        for (int i = 0; i < patternLength - 1; i++) {
            power = (power * BASE) % MOD;
        }

        long patternHash = 0;
        long lineHash = 0;
        for (int i = 0; i < patternLength; i++) {
            patternHash = (patternHash * BASE + pattern.charAt(i)) % MOD;
            lineHash = (lineHash * BASE + line.charAt(i)) % MOD;
        }

        if (patternHash == lineHash) {
            if (line.substring(0, patternLength).equals(pattern)) {
                System.out.println(1);
                return;
            }
        }

        for (int i = 1; i <= lineLength - patternLength; i++) {
            lineHash = (lineHash + MOD - line.charAt(i - 1) * power % MOD) % MOD;
            lineHash = (lineHash * BASE + line.charAt(i + patternLength - 1)) % MOD;

            if (lineHash == patternHash) {
                if (line.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
    }
}
