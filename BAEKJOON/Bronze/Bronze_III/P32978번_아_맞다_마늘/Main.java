package P32978번_아_맞다_마늘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            set.add(input[i]);
        }
        input = br.readLine().split(" ");
        for (String ingredient : input) {
            if (set.contains(ingredient)) {
                set.remove(ingredient);
            }
        }
        for (String ingredient : set) {
            System.out.println(ingredient);
        }
    }
}