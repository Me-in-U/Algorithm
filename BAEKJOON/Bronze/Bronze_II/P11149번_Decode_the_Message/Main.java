package P11149번_Decode_the_Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] words = br.readLine().split(" ");
            for (String word : words) {
                int sum = 0;
                for (int i = 0; i < word.length(); i++)
                    sum = (sum + word.charAt(i) - 'a') % 27;
                sb.append(sum == 26 ? " " : (char) (sum + 'a'));
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}