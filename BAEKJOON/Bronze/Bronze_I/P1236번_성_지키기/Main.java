package P1236번_성_지키기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        boolean[] N_checked = new boolean[N];
        boolean[] M_checked = new boolean[M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    N_checked[i] = true;
                    M_checked[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!N_checked[i] && !M_checked[j]) {
                    N_checked[i] = true;
                    M_checked[j] = true;
                    count++;
                }
            }
        }
        for (int i = 0; i < N; i++)
            if (!N_checked[i])
                count++;
        for (int i = 0; i < M; i++)
            if (!M_checked[i])
                count++;
        System.out.println(count);
    }
}
