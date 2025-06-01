package 태권도와_복싱을_합한_운동;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        StringBuilder sb1 = getFirstSyllable(A);
        StringBuilder sb2 = getFirstSyllable(B);
        if (sb1 == null || sb2 == null) {
            System.out.print("no such exercise");
            return;
        }
        System.out.println(sb1.append(sb2).toString());
    }

    public static StringBuilder getFirstSyllable(String str) {
        int firstVowelIndex = getFirstVowelIndex(str);
        if (firstVowelIndex == -1) {
            return null;
        }
        int lastIndex = firstVowelIndex + 1;
        while (lastIndex < str.length() && isVowel(str.charAt(lastIndex))) {
            lastIndex++;
        }
        if (lastIndex >= str.length()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lastIndex; i++) {
            sb.append(str.charAt(i));
        }
        return sb;
    }

    public static int getFirstVowelIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }
}
