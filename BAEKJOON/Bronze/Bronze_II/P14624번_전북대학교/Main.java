package P14624번_전북대학교;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if (N % 2 == 0) {
            sb.append("I LOVE CBNU");
        } else {
            sb.append("*".repeat(N)).append('\n');
            StringBuilder temp = new StringBuilder();
            int spaces = N / 2;
            temp.append(" ".repeat(spaces)).append('*');
            sb.append(temp).append('\n');
            temp.append(" *");
            while (spaces-- > 0) {
                temp.delete(0, 1);
                sb.append(temp).append('\n');
                temp.insert(spaces + 1, "  ");
            }
        }
        System.out.print(sb.toString());
    }
}