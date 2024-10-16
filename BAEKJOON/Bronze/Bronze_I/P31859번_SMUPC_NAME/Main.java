package P31859번_SMUPC_NAME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        boolean[] alphabet = new boolean[26];
        StringBuilder newName = new StringBuilder();
        for (int i = 0; i < input[1].length(); i++) {
            char c = input[1].charAt(i);
            if (!alphabet[c - 'a']) {
                newName.append(c);
                alphabet[c - 'a'] = true;
            }
        }
        newName.append(input[1].length() - newName.length() + 4);
        newName.insert(0, (Integer.parseInt(input[0]) + 1906));
        newName.reverse();
        newName.insert(0, "smupc_");
        System.out.println(newName.toString());
    }
}