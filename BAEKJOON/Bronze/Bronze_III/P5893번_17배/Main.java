package BAEKJOON.Bronze.Bronze_III.P5893번_17배;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new BigInteger(new BufferedReader(new InputStreamReader(System.in)).readLine(), 2)
                .multiply(BigInteger.valueOf(17)).toString(2));
    }
}
