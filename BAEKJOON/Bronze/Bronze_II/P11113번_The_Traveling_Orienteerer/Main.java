package P11113번_The_Traveling_Orienteerer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            data[i] = new double[] { Double.parseDouble(input[0]), Double.parseDouble(input[1]) };
        }
        int m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            int K = Integer.parseInt(br.readLine());
            int[] points = new int[K];
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < K; i++) {
                points[i] = Integer.parseInt(input[i]);
            }
            double result = 0.0;
            for (int i = 1; i < K; i++) {
                result += Math.sqrt(Math.pow(data[points[i - 1]][0] - data[points[i]][0], 2)
                        + Math.pow(data[points[i - 1]][1] - data[points[i]][1], 2));
            }
            System.out.println(Math.round(result));
        }
    }
}