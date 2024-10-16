package P23794번_골뱅이_찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < N + 2; i++) {
            sb1.append('@');
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb2.append('@');
            for (int j = 0; j < N; j++) {
                sb2.append(' ');
            }
            sb2.append('@');
            sb2.append('\n');
        }
        System.out.println(sb1.toString());
        System.out.print(sb2.toString());
        System.out.println(sb1.toString());
    }
}