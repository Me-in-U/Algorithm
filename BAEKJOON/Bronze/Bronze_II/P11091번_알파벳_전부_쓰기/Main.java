package BAEKJOON.Bronze.Bronze_II.P11091번_알파벳_전부_쓰기;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        int n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int used = 0;
            while ((c = System.in.read()) != '\n')
                if (c >= 65)
                    used |= 1 << ((c & 31) - 1);
            if (used == (1 << 26) - 1) {
                sb.append("pangram");
            } else {
                sb.append("missing ");
                for (int shift = 0; shift < 26; shift++)
                    if ((used & (1 << shift)) == 0)
                        sb.append((char) (shift + 97));
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
