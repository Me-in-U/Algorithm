package BAEKJOON.Bronze.Bronze_I.P3035번_스캐너;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ZR = Integer.parseInt(st.nextToken());
        int ZC = Integer.parseInt(st.nextToken());
        for (int i = 0; i < R; i++) {
            String data = br.readLine();
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < C; j++)
                for (int z = 0; z < ZC; z++)
                    temp.append(data.charAt(j));
            for (int z = 0; z < ZR; z++)
                sb.append(temp).append('\n');
        }
        System.out.print(sb.toString());
    }
}
