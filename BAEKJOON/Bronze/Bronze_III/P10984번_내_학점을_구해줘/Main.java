package P10984번_내_학점을_구해줘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            double gradeSum = 0;
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int C = Integer.parseInt(st.nextToken());
                double G = Double.parseDouble(st.nextToken());
                sum += C;
                gradeSum += C * G;
            }
            sb.append(sum).append(' ').append(Math.round(gradeSum / sum * 10) / 10.0).append('\n');
        }
        System.out.print(sb.toString());
    }
}