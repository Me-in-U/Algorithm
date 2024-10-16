package P10829번_이진수_변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (input != 0) {
            sb.append(input % 2);
            input /= 2;
        }
        System.out.print(sb.reverse().toString());
    }
}
