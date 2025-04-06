package BAEKJOON.Bronze.Bronze_III.P30822번_UOSPC_세기;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        while (System.in.read() != '\n')
            ;
        int u = 0;
        int o = 0;
        int s = 0;
        int p = 0;
        int c = 0;
        int d;
        while ((d = System.in.read()) != '\n') {
            if (d == 'u') {
                u++;
            } else if (d == 'o') {
                o++;
            } else if (d == 's') {
                s++;
            } else if (d == 'p') {
                p++;
            } else if (d == 'c') {
                c++;
            }
        }
        System.out.println(Math.min(u, Math.min(o, Math.min(s, Math.min(p, c)))));
    }
}