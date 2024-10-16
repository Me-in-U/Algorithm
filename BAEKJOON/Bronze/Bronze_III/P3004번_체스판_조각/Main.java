package P3004번_체스판_조각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int row = n / 2;
        int col = n - row;
        System.out.println((row + 1) * (col + 1));
    }
}