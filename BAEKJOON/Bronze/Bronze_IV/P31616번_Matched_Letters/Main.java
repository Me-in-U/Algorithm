package P31616번_Matched_Letters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        char c = S.charAt(0);
        boolean allSame = true;
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) != c) {
                allSame = false;
                break;
            }
        }
        System.out.println(allSame ? "Yes" : "No");
    }
}