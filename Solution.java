import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < input.length; j++) {
                int num = Integer.parseInt(input[j]);
                if (num % 2 == 1) {
                    sum += num;
                }
            }
            sb.append("#").append(i).append(' ').append(sum).append('\n');
        }
        System.out.print(sb.toString());
    }
}