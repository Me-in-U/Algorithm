package BAEKJOON.Bronze.Bronze_I.P11383번_똚;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        String[] lines = new String[N];
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                sb.append(c).append(c);
            }
            lines[i] = sb.toString();
        }
        boolean not = false;
        for (int i = 0; i < N; i++) {
            if (!lines[i].equals(br.readLine())) {
                not = true;
            }
        }
        System.out.println(not ? "Not Eyfa" : "Eyfa");
    }
}