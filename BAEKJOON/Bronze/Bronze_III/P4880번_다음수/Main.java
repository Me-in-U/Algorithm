package P4880번_다음수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] input = br.readLine().split(" ");
            int a1 = Integer.parseInt(input[0]);
            int a2 = Integer.parseInt(input[1]);
            int a3 = Integer.parseInt(input[2]);
            if (a1 == 0 && a2 == 0 && a3 == 0) {
                break;
            }
            int sub1 = a2 - a1;
            int sub2 = a3 - a2;
            if (sub1 == sub2) {
                sb.append("AP ").append(a3 + sub1);
            } else {
                sb.append("GP ").append(a3 * (a3 / a2));
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}