package P5235번_Even_Sum_More_Than_Odd_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cases = Integer.parseInt(br.readLine());
        while (cases-- > 0) {
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int odd = 0;
            int even = 0;
            for (int i = 1; i <= numbers[0]; i++) {
                if (numbers[i] % 2 == 0) {
                    even += numbers[i];
                } else {
                    odd += numbers[i];
                }
            }
            if (odd == even) {
                sb.append("TIE");
            } else {
                sb.append(odd > even ? "ODD" : "EVEN");
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}