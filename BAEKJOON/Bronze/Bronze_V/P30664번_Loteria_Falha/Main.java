package BAEKJOON.Bronze.Bronze_V.P30664번_Loteria_Falha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    private static final BigInteger FORTY_TWO = BigInteger.valueOf(42);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        while (!(input = br.readLine()).equals("0")) {
            BigInteger bi = new BigInteger(input);
            sb.append(bi.remainder(FORTY_TWO).equals(BigInteger.ZERO) ? "PREMIADO" : "TENTE NOVAMENTE").append('\n');
        }
        System.out.print(sb.toString());
    }
}
