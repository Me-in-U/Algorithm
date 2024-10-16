package P31306번_Is_Y_a_Vowel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int v = 0;
        int y = 0;
        String w = new BufferedReader(new InputStreamReader(System.in)).readLine();
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                v++;
            else if (c == 'y')
                y++;
        }
        System.out.println(new StringBuilder().append(v).append(' ').append(v + y));
    }
}