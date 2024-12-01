package P20361번_일우는_야바위꾼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);
        int[] cups = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            cups[i] = i;
        }
        for (int i = 0; i < K; i++) {
            input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            if (A == X) {
                X = B;
            } else if (B == X) {
                X = A;
            }
            int temp = A;
            cups[B] = A;
            cups[A] = temp;
        }
        System.out.println(X);
    }
}