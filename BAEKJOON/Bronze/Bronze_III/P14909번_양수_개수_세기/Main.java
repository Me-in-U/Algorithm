package P14909번_양수_개수_세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long count = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(a -> a > 0)
                .count();
        System.out.println(count);
    }
}