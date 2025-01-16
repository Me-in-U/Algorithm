package P4539번_반올림;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        while (n-- > 0) {
            StringBuilder temp = new StringBuilder();
            temp.append('\n');
            int num = Integer.parseInt(br.readLine());
            if (10 <= num) {
                while (1 <= num / 10) {
                    temp.append(0);
                    if (5 <= num % 10) {
                        num += 10;
                    }
                    num /= 10;
                }
            }
            temp.append(num);
            result.append(temp.reverse());
        }
        System.out.print(result.toString());
    }
}