package P4613번_Quicksum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()).charAt(0) != '#') {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c != ' ') {
                    sum += (i + 1) * (c - 'A' + 1);
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb.toString());
    }
}