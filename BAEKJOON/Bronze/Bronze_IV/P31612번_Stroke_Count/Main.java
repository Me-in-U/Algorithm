package P31612번_Stroke_Count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == 'j' || c == 'i') {
                sum += 2;
            } else if (c == 'o') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}