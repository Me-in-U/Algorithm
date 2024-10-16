package P2863번_이게_분수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double C = Double.parseDouble(st.nextToken());
        double D = Double.parseDouble(st.nextToken());
        double[] rotated = {
                (A / C) + (B / D),
                (C / D) + (A / B),
                (D / B) + (C / A),
                (B / A) + (D / C)
        };
        double max = 0;
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (max < rotated[i]) {
                max = rotated[i];
                count = i;
            }
        }
        System.out.println(count);
    }
}