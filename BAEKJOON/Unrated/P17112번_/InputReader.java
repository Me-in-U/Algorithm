package P17112번_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class InputReader {
    public static String readInput() throws Exception {
        Reader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        int ch;

        // 한 글자씩 읽기
        while ((ch = reader.read()) != -1 && ch != '\n') {
            sb.append((char) ch);
        }

        return sb.toString();
    }
}
