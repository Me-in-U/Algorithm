package P2556번_별_찍기_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < N; i++)
            sb2.append('*');
        for (int i = 0; i < N; i++)
            sb1.append(sb2).append('\n');
        System.out.print(sb1.toString());
    }
}