package P23804번_골뱅이_찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb1.append("@@@@@");
            }
            sb1.append('\n');
        }
        for (int i = 0; i < N * 3; i++) {
            for (int j = 0; j < N; j++) {
                sb2.append('@');
            }
            sb2.append('\n');
        }
        System.out.print(sb1.toString());
        System.out.print(sb2.toString());
        System.out.print(sb1.toString());
    }
}
