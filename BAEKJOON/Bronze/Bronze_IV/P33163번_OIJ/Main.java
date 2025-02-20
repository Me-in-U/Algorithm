package P33163번_OIJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char c = line.charAt(i);
            if (c == 'J')
                sb.append('O');
            if (c == 'O')
                sb.append('I');
            if (c == 'I')
                sb.append('J');
        }
        System.out.print(sb);
    }
}