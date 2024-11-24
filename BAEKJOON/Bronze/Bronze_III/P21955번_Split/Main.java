package P21955번_Split;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, str.length() / 2)).append(' ')
                .append(str.substring(str.length() / 2, str.length()));
        System.out.println(sb.toString());
    }
}