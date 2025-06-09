package BAEKJOON.Bronze.Bronze_IV.P29267번_Случай_с_игрой;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        int N = Integer.parseInt(first[0]);
        int K = Integer.parseInt(first[1]);

        int c = 0;
        int s = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();
            switch (cmd) {
            case "save":
                s = c;
                break;
            case "load":
                c = s;
                break;
            case "shoot":
                c--;
                break;
            case "ammo":
                c += K;
                break;
            default:
                break;
            }
            sb.append(c).append('\n');
        }

        System.out.print(sb);
    }
}
