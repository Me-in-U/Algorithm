package P12813번_이진수_연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        StringBuilder andResult = new StringBuilder();
        StringBuilder orResult = new StringBuilder();
        StringBuilder xorResult = new StringBuilder();
        StringBuilder notAResult = new StringBuilder();
        StringBuilder notBResult = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            andResult.append((a == '1' && b == '1') ? '1' : '0');
            orResult.append((a == '1' || b == '1') ? '1' : '0');
            xorResult.append((a != b) ? '1' : '0');
            notAResult.append(a == '1' ? '0' : '1');
            notBResult.append(b == '1' ? '0' : '1');
        }
        System.out.println(andResult.toString());
        System.out.println(orResult.toString());
        System.out.println(xorResult.toString());
        System.out.println(notAResult.toString());
        System.out.println(notBResult.toString());
    }
}
