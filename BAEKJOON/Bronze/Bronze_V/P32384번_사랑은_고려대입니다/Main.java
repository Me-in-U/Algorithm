package P32384번_사랑은_고려대입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    protected static final String LKU = "LoveisKoreaUniversity";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            sb.append(LKU).append(' ');
        }
        System.out.print(sb.toString());
    }
}