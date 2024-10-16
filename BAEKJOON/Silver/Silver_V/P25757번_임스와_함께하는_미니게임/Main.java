package P25757번_임스와_함께하는_미니게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        String type = input[1];
        HashSet<String> set = new HashSet<>();
        while (N-- > 0) {
            set.add(br.readLine());
        }
        int result;
        if (type.equals("Y")) {
            result = set.size();
        } else if (type.equals("F")) {
            result = set.size() / 2;
        } else {
            result = set.size() / 3;
        }
        System.out.println(result);
    }
}