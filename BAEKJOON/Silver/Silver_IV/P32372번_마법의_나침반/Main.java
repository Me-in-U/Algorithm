package P32372번_마법의_나침반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int provedX = -1;
        int provedY = -1;
        int minX = 1;
        int maxX = N;
        int minY = 1;
        int maxY = N;
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);
            if (K == 1) {
                maxX = Math.min(maxX, X - 1);
                provedY = Y;
            } else if (K == 2) {
                maxX = Math.min(maxX, X - 1);
                minY = Math.max(minY, Y + 1);
            } else if (K == 3) {
                provedX = X;
                minY = Math.max(minY, Y + 1);
            } else if (K == 4) {
                minX = Math.max(minX, X + 1);
                minY = Math.max(minY, Y + 1);
            } else if (K == 5) {
                minX = Math.max(minX, X + 1);
                provedY = Y;
            } else if (K == 6) {
                minX = Math.max(minX, X + 1);
                maxY = Math.min(maxY, Y - 1);
            } else if (K == 7) {
                provedX = X;
                maxY = Math.min(maxY, Y - 1);
            } else if (K == 8) {
                maxX = Math.min(maxX, X - 1);
                maxY = Math.min(maxY, Y - 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (provedX != -1) {
            sb.append(provedX);
        } else {
            sb.append(maxX);
        }
        sb.append(' ');
        if (provedY != -1) {
            sb.append(provedY);
        } else {
            sb.append(maxY);
        }
        System.out.print(sb.toString());
    }
}