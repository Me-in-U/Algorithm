package P33166번_Railway_Trip_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int P = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        System.out.println((Q <= P) ? (Q * A) : (P * A) + ((Q - P) * B));
    }
}
