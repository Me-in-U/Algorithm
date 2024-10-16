package P3020번_개똥벌레;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int[] stalactite = new int[H + 1];
        int[] stalagmite = new int[H + 1];
        for (int i = 0; i < N; i += 2) {
            stalactite[Integer.parseInt(br.readLine())]++;
            stalagmite[Integer.parseInt(br.readLine())]++;
        }
        for (int i = H - 1; 0 < i; i--) {
            stalactite[i] += stalactite[i + 1];
            stalagmite[i] += stalagmite[i + 1];
        }
        int count = 0;
        int min = N;
        for (int i = H; 0 < i; i--) {
            int temp = stalactite[i] + stalagmite[H - i + 1];
            if (temp < min) {
                count = 1;
                min = temp;
            } else if (temp == min) {
                count++;
            }
        }
        System.out.println(new StringBuilder().append(min).append(' ').append(count));
    }
}