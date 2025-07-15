package BAEKJOON.Bronze.Bronze_III.P9366번_삼각형_분류;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int T = readInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            int A = readInt();
            int B = readInt();
            int C = readInt();
            String type;
            // 삼각형 성립 조건 검사
            if (A + B <= C || A + C <= B || B + C <= A)
                type = "invalid!";
            // 모든 변이 같으면 정삼각형
            else if (A == B && B == C)
                type = "equilateral";
            // 두 변이 같으면 이등변삼각형
            else if (A == B || A == C || B == C)
                type = "isosceles";
            // 나머지는 부등변삼각형
            else
                type = "scalene";
            sb.append("Case #").append(tc).append(": ").append(type).append("\n");
        }
        System.out.print(sb);
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
