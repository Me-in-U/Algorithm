package BAEKJOON.Bronze.Bronze_I.P17294번_귀여운_수;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String k = br.readLine();
        boolean cute = true;
        if (k.length() > 2) {
            int d = (k.charAt(0) - '0') - (k.charAt(1) - '0');
            for (int i = 1; i < k.length() - 1; i++) {
                if ((k.charAt(i) - '0') - (k.charAt(i + 1) - '0') != d) {
                    cute = false;
                    break;
                }
            }
        }
        System.out.println(cute ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");
    }
}
