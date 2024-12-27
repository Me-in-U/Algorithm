package P17094번_Serious_Problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count_e = readInt();
        int count_2 = 0;
        int c;
        while ((c = System.in.read()) >= 48) {
            if (c == '2') {
                count_2++;
            }
        }
        count_e -= count_2;
        bw.write(count_2 == count_e ? "yee" : (count_2 > count_e ? "2" : "e"));
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
