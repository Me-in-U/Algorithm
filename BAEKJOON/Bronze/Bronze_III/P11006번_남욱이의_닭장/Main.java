package P11006번_남욱이의_닭장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int TCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < TCase; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int U = (M * 2) - N;
            sb.append(U).append(' ').append(M - U).append('\n');
        }
        System.out.print(sb.toString());
    }
}