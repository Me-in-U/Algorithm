package P6131번_완전_제곱수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int B = 1; B <= 500; B++) {
            int BBN = (B * B) + N;
            int A = (int) Math.sqrt(BBN);
            if (A * A == BBN)
                count++;
        }
        System.out.println(count);
    }
}