import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 바코드_닉네임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        for (int i = 0; i < n; i++) {
            char c = line.charAt(i);
            sb.append(c == 'I' ? 'i' : 'L');
        }
        System.out.print(sb.toString());
    }
}