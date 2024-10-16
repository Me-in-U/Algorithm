package P3034번_앵그리_창영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int maxLength = W * W + H * H;
        for (int i = 0; i < N; i++) {
            int L = Integer.parseInt(br.readLine());
            sb.append(maxLength >= L * L ? "DA" : "NE").append('\n');
        }
        System.out.print(sb.toString());
    }
}