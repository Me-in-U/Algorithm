package P30999번_민주주의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int count = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            int agree = 0;
            for (int j = 0; j < line.length(); j++)
                if (line.charAt(j) == 'O')
                    agree++;
            if (agree > M / 2)
                count++;
        }
        System.out.println(count);
    }
}