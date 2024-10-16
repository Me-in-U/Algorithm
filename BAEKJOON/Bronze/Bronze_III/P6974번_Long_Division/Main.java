package P6974번_Long_Division;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            BigInteger bi1 = new BigInteger(br.readLine());
            BigInteger bi2 = new BigInteger(br.readLine());
            BigInteger[] result = bi1.divideAndRemainder(bi2);
            sb.append(result[0]).append('\n').append(result[1]).append("\n\n");
        }
        System.out.print(sb.toString().trim());
    }
}