package BAEKJOON.Silver.Silver_V.P10709번_기상캐스터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] HW = br.readLine().split(" ");
        int H = Integer.parseInt(HW[0]);
        int W = Integer.parseInt(HW[1]);
        for (int i = 0; i < H; i++) {
            String line = br.readLine();
            int cloud = -1;
            for (int j = 0; j < W; j++) {
                if (line.charAt(j) == 'c') {
                    cloud = j;
                    sb.append(0);
                } else if (cloud == -1) {
                    sb.append(-1);
                } else {
                    sb.append(j - cloud);
                }
                sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}