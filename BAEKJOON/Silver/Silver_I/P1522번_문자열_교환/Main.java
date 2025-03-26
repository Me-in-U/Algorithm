package P1522번_문자열_교환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count_A = (int) input.chars().filter(c -> c == 'a').count();
        System.out.println("count_A = " + count_A);
        List<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        int current_A = 0;
        System.out.println(list.toString());
        for (int i = 0; i < count_A; i++) {
            System.out.print(list.get(i));
            if (list.get(i) == 'a') {
                count_A++;
            }
        }
        int max_A_Count = 0;
        for (int i = 0; i < input.length(); i++) {
            max_A_Count = Math.max(max_A_Count, current_A);
            if (list.get(0) == 'a') {
                current_A--;
            }
            if (list.get(count_A) == 'a') {
                current_A++;
            }
            list.add(list.remove(0));
        }
        System.out.println(input.length() - max_A_Count);
    }
}
