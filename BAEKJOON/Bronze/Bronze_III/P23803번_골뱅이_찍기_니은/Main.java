package P23803번_골뱅이_찍기_니은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int j = 0; j < 4 * N; j++) {
            for (int i = 0; i < N; i++) {
                sb.append('@');
            }
            sb.append('\n');
        }
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                sb.append("@@@@@");
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}