package P23303번_이_문제는_D2_입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'D' || input.charAt(i) == 'd') {
                if (input.charAt(i + 1) == '2') {
                    System.out.println("D2");
                    return;
                }
            }
        }
        System.out.println("unrated");
    }
}