package P17010번_Time_to_Decompress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] input;
        while (N-- > 0) {
            input = br.readLine().split(" ");
            int times = Integer.parseInt(input[0]);
            char character = input[1].charAt(0);
            for (int i = 0; i < times; i++)
                sb.append(character);
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}