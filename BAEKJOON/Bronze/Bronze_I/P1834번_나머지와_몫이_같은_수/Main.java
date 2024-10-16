package P1834번_나머지와_몫이_같은_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (N + 1) * i;
        }
        System.out.println(sum);
    }
}