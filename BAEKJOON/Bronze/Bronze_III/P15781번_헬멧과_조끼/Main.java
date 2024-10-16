package P15781번_헬멧과_조끼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
            System.out.println(
                    Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).max().orElseThrow() +
                            Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).max().orElseThrow());
        }
    }
}