import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 고장난키보드 {
    private static double[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] once = new double[10];
        double[] twice = new double[10];
        once[0] = 1.0;
        for (int i = 1; i < 10; i++) {
            String[] input = br.readLine().split(" ");
            double P = Double.parseDouble(input[0]);
            double Q = Double.parseDouble(input[1]);
            once[i] = P / (P + Q);
            twice[i] = Q / (P + Q);
        }
        String[] backspaceInput = br.readLine().split(" ");
        double P_Backspace = Double.parseDouble(backspaceInput[0]);
        double Q_Backspace = Double.parseDouble(backspaceInput[1]);
        double onceBackspace = P_Backspace / (P_Backspace + Q_Backspace);
        double twiceBackspace = Q_Backspace / (P_Backspace + Q_Backspace);
        int N = Integer.parseInt(br.readLine());
        String target = br.readLine();
        dp = new double[N + 1];
        dp[0] = 0;
        for (int i = 1; i <= N; i++) {
            double exp = 0.0;
            int num = target.charAt(i - 1) - '0';
            if (i >= 1) {
                exp += once[num] * (dp[i - 1] + 1);
            }
            if (i >= 2) {
                exp += twice[num] * (dp[i - 2] + 1 + (1));
            }
            dp[i] = exp;
        }
        System.out.printf("%.6f\n", dp[N]);
    }
}
