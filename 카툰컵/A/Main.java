package 카툰컵.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "CE";
        if (str != null && str.startsWith("\"") && str.endsWith("\"") && str.length() > 2) {
            result = str.substring(1, str.length() - 1);
        }
        System.out.println(result);
    }
}
