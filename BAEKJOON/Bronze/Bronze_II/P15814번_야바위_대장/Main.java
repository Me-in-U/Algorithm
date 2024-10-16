package P15814번_야바위_대장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            char temp = c[A];
            c[A] = c[B];
            c[B] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }
}