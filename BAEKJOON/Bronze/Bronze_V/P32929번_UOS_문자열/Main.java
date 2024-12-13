package P32929번_UOS_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        char[] UOS = { 'U', 'O', 'S' };
        System.out.println(UOS[(x - 1) % 3]);
    }
}