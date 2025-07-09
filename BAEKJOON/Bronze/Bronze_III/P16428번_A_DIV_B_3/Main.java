package BAEKJOON.Bronze.Bronze_III.P16428번_A_DIV_B_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger dividend = new BigInteger(st.nextToken());
        BigInteger divisor = new BigInteger(st.nextToken());

        BigInteger absoluteDivisor = divisor.abs();
        BigInteger remainder = dividend.remainder(absoluteDivisor);
        if (remainder.signum() < 0)
            remainder = remainder.add(absoluteDivisor);
        BigInteger quotient = dividend.subtract(remainder).divide(divisor);

        StringBuilder sb = new StringBuilder();
        sb.append(quotient).append('\n').append(remainder);
        System.out.print(sb);
    }
}
