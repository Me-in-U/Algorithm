package P11816번_8진수_10진수_16진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int result = -1;
        if (number.charAt(0) != '0') {
            result = Integer.parseInt(number);
        } else if (number.charAt(1) != 'x') {
            result = Integer.parseInt(number.substring(1), 8);
        } else {
            result = Integer.parseInt(number.substring(2), 16);
        }
        System.out.println(result);
    }
}