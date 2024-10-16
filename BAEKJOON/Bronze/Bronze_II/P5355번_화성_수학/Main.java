package P5355번_화성_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            float data = Float.parseFloat(input[0]);
            for (int i = 1; i < input.length; i++) {
                if (input[i].equals("@")) {
                    data *= 3;
                } else if (input[i].equals("%")) {
                    data += 5;
                } else if (input[i].equals("#")) {
                    data -= 7;
                }
            }
            sb.append(String.format("%.2f", data)).append('\n');
        }
        System.out.print(sb.toString());
    }
}