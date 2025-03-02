package P1837번_암호제작;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = System.in.read()) != -1) {
            if (c == ' ')
                break;
            sb.append((char) c);
        }
        BigInteger P = new BigInteger(sb.toString());
        int K = readInt();
        boolean[] isPrime = new boolean[K];
        Arrays.fill(isPrime, true);
        if (K > 0)
            isPrime[0] = false;
        if (K > 1)
            isPrime[1] = false;
        for (int i = 2; i * i < K; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < K; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < K; i++) {
            if (isPrime[i]) {
                if (P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    System.out.print(new StringBuilder().append("BAD ").append(i));
                    return;
                }
            }
        }
        System.out.print(new StringBuilder().append("GOOD"));
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        return n;
    }
}
