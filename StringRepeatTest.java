import java.io.IOException;

public class StringRepeatTest {
    public static void main(String[] args) {
        int N = 10000;
        String str = "@";

        // Test repeat()
        long startRepeat = System.nanoTime();

        long endRepeat = System.nanoTime();
        System.out.println("String.repeat() Time: " + (endRepeat - startRepeat) + " ns");
    }

    public static char[] readString() throws IOException {
        int c;
        StringBuilder sb = new StringBuilder();
        while ((c = System.in.read()) != -1 && c != '\n' && c != '\r')
            sb.append((char) c);
        if (c == '\r')
            System.in.read();
        return sb.toString().toCharArray();
    }
}
