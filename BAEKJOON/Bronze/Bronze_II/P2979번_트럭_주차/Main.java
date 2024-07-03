package P2979번_트럭_주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] time = new int[100];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = start; j < end; j++) {
                time[j]++;
            }
        }
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if (time[i] == 1) {
                result += A;
            } else if (time[i] == 2) {
                result += B * 2;
            } else if (time[i] == 3) {
                result += C * 3;
            }
        }
        System.out.println(result);
    }
}