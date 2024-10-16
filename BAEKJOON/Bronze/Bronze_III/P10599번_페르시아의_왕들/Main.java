package P10599번_페르시아의_왕들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] input = null;
        while (true) {
            input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (input[0] == 0 && input[1] == 0 && input[2] == 0 && input[3] == 0) {
                break;
            }
            sb.append(input[2] - input[1]).append(' ').append(input[3] - input[0]).append('\n');
        }
        System.out.print(sb.toString());
    }
}
