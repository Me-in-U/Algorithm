package P11295번_Exercising;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1;; i++) {
            int stride = Integer.parseInt(br.readLine().trim());
            if (stride == 0) {
                break;
            }
            sb.append("User ").append(i).append('\n');
            int N = Integer.parseInt(br.readLine().trim());
            while (N-- > 0) {
                double distance = (stride * Integer.parseInt(br.readLine().trim())) / 100000.0;
                sb.append(String.format("%.5f", distance)).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}
