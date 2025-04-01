package P10181번_Federation_Favorites;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int n;
        while ((n = readInt()) != -1) {
            int sum = 0;
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = n - 1; i > 0; i--) {
                if (n % i == 0) {
                    deque.add(i);
                    sum += i;
                }
            }
            sb.append(n);
            if (sum == n) {
                sb.append(" = ");
                while (!deque.isEmpty()) {
                    sb.append(deque.pollLast());
                    if (!deque.isEmpty()) {
                        sb.append(" + ");
                    }
                }
                sb.append('\n');
            } else {
                sb.append(" is NOT perfect.").append("\n");
            }
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int n = 0;
        int c = System.in.read();
        boolean isNegative = false;
        while (c <= 32) {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c - '0');
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
