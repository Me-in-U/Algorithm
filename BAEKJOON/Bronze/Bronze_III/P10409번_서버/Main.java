package P10409번_서버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(st.nextToken());
            if (T >= time) {
                T -= time;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}