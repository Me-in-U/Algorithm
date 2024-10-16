package P2783번_삼각_김밥;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        double minPrice = (double) X / Y * 1000;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int X1 = Integer.parseInt(st.nextToken());
            int Y1 = Integer.parseInt(st.nextToken());
            double price = (double) X1 / Y1 * 1000;
            minPrice = Math.min(minPrice, price);
        }
        System.out.println(minPrice);
    }
}