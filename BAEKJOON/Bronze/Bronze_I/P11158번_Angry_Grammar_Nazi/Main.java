package BAEKJOON.Bronze.Bronze_I.P11158번_Angry_Grammar_Nazi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int yell = 0;
            String[] words = br.readLine().split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals("u") || words[i].equals("ur") || words[i].contains("lol")) {
                    yell++;
                }

                if (i < words.length - 1 && (words[i].equals("would") || words[i].equals("should"))) {
                    if (words[i + 1].equals("of")) {
                        yell++;
                    }
                }
            }
            sb.append(yell * 10).append('\n');
        }
        System.out.print(sb.toString());
    }
}
