package P30456번_바닥수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        String result = "";
        if (N == 0) {
            result = "1" + "0".repeat(L - 1);
        } else {
            result = N + "1".repeat(L - 1);
        }
        System.out.println(result);
    }
}
