package P11104번_Fridge_of_Your_Dreams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int n = readInt();
        while (n-- > 0) {
            int number = 0;
            for (int shift = 23; shift >= 0; shift--) {
                if ((System.in.read() & 15) == 1) {
                    number += (1 << shift);
                }
            }
            System.in.read();
            // System.in.read();
            sb.append(number).append('\n');
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
