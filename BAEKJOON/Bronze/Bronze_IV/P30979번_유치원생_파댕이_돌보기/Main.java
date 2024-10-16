package P30979번_유치원생_파댕이_돌보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            T -= Integer.parseInt(st.nextToken());
        }
        System.out.println(T > 0 ? "Padaeng_i Cry" : "Padaeng_i Happy");
    }
}