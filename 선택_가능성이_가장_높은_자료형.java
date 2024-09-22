import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 선택_가능성이_가장_높은_자료형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        if (-32768 <= N && N <= 32767) {
            System.out.println("short");
        } else if (-2147483648L <= N && N <= 2147483647L) {
            System.out.println("int");
        } else if (-9223372036854775808L <= N && N <= 9223372036854775807L) {
            System.out.println("long long");
        }
    }
}
