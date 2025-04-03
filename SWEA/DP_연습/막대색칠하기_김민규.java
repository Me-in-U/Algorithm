
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 막대색칠하기_김민규 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 2];
        dp[1] = 2;
        dp[2] = 5;
        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] << 1) + dp[i - 2];
        }
        System.out.print(dp[N]);
    }
}