package P10179번_쿠폰;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++)
            sb.append('$')
                    .append(String.format("%.2f", Math.round(Double.parseDouble(br.readLine()) * 80) / 100.0))
                    .append('\n');
        System.out.print(sb.toString());
    }
}