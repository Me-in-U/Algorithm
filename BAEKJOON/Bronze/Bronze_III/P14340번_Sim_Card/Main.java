package P14340번_Sim_Card;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] prices = new int[3];
        while (true) {
            int call = readInt();
            int data = readInt();
            if (call == 0 && data == 0) {
                break;
            }
            prices[0] = call * 30 + data * 40;
            prices[1] = call * 35 + data * 30;
            prices[2] = call * 40 + data * 20;
            Arrays.sort(prices);
            sb.append(prices[0]).append('\n');
        }
        bw.write(sb.toString().trim());
        bw.flush();
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}