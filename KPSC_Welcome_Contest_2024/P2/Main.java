package KPSC_Welcome_Contest_2024.P2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String reStart = br.readLine().substring(0, 5);
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            if (reStart.equals(br.readLine().substring(0, 5))) {
                count++;
            }
        }
        System.out.println(count);
    }
}