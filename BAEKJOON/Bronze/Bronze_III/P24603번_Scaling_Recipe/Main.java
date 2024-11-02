package P24603번_Scaling_Recipe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);
        int y = Integer.parseInt(input[2]);
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            sb.append(a * y / x).append('\n');
        }
        System.out.print(sb.toString());
    }
}
