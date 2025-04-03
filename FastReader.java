import java.io.IOException;
import java.io.InputStream;

public class FastReader {
    private final int BUFFER_SIZE = 1 << 16;
    private final InputStream in;
    private final byte[] buffer;
    private int bufferPointer, bytesRead;
    private final StringBuilder sb;

    public FastReader(InputStream in) {
        this.in = in;
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = 0;
        bytesRead = 0;
        sb = new StringBuilder();
    }

    private int read() throws IOException {
        if (bufferPointer == bytesRead) {
            bytesRead = in.read(buffer, 0, BUFFER_SIZE);
            if (bytesRead == -1)
                return -1;
            bufferPointer = 0;
        }
        return buffer[bufferPointer++] & 0xff;
    }

    public int nextInt() throws IOException {
        int c = read();
        while (c <= ' ')
            c = read();
        boolean negative = false;
        if (c == '-') {
            negative = true;
            c = read();
        }
        int result = 0;
        while ('0' <= c && c <= '9') {
            result = result * 10 + (c & 15);
            c = read();
        }
        return negative ? -result : result;
    }

    public String next() throws IOException {
        int c = read();
        while (c <= ' ')
            c = read();
        sb.setLength(0);
        while (c > ' ') {
            sb.append((char) c);
            c = read();
        }
        return sb.toString();
    }

    public String nextLine() throws IOException {
        int c = read();
        while (c != -1 && (c == '\n' || c == '\r'))
            c = read();
        if (c == -1)
            return null;
        sb.setLength(0);
        while (c != -1 && c != '\n' && c != '\r') {
            sb.append((char) c);
            c = read();
        }
        return sb.toString();
    }

    public double nextDouble() throws IOException {
        int c = read();
        while (c <= ' ')
            c = read();
        boolean negative = false;
        if (c == '-') {
            negative = true;
            c = read();
        }
        double result = 0;
        while ('0' <= c && c <= '9') {
            result = (result * 10) + (c & 15);
            c = read();
        }
        if (c == '.') {
            c = read();
            double fraction = 0;
            double factor = 1;
            while ('0' <= c && c <= '9') {
                fraction = (fraction * 10) + (c - '0');
                factor *= 10;
                c = read();
            }
            result += fraction / factor;
        }
        return negative ? -result : result;
    }
}
