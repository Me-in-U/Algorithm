package P31833번_온데간데없을뿐더러;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String A = br.readLine().replace(" ", "");
        String B = br.readLine().replace(" ", "");
        Long X = Long.parseLong(A);
        Long Y = Long.parseLong(B);
        System.out.println(X > Y ? Y : X);
    }
}
