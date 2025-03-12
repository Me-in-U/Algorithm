package P32978번_아_맞다_마늘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c;
        int N = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            N = (N * 10) + (c & 15);
        String[] fullIngredients = br.readLine().split(" ");
        String[] usedIngredients = br.readLine().split(" ");
        Set<String> usedSet = Arrays.stream(usedIngredients).collect(Collectors.toSet());
        for (String ingredient : fullIngredients) {
            if (!usedSet.remove(ingredient)) {
                System.out.print(ingredient);
                return;
            }
        }
    }
}