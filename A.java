import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException {
        System.out.print(Integer.parseInt("1".repeat(readInt())) + Integer.parseInt("1".repeat(readInt())));
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
