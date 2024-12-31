package P11648번_지속;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int last = 0;
        while (number.length() > 1) {
            int multi = 1;
            for (int i = 0; i < number.length(); i++) {
                multi *= number.charAt(i) - '0';
            }
            number = String.valueOf(multi);
            last++;
        }
        System.out.println(last);
    }
}