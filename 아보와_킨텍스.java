import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아보와_킨텍스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int count = ((N + 1) * 26) - 2;
        if (N > 1) {
            count -= (N - 2);
        } else {
            count++;
        }
        System.out.println(count);
    }
}
