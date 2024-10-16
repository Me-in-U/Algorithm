package P30143번_Cookie_Piles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int A = Integer.parseInt(line[1]);
            int D = Integer.parseInt(line[2]);
            sb.append(N * A + D * (N * (N - 1)) / 2).append('\n');
        }
        System.out.print(sb.toString());
    }
}
