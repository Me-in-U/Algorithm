package P31048번_Last_Factorial_Digit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] numbers = { 0, 1, 2, 6, 4 };
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(numbers[N < 5 ? N : 0]).append('\n');
        }
        System.out.print(sb.toString());
    }
}