package P32089번_部員の変遷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int max = 0;
            int current = 0;
            for (int i = 0; i < n; i++) {
                current += (a[i] - ((3 <= i) ? a[i - 3] : 0));
                max = Math.max(max, current);
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb.toString());
    }
}
