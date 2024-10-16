package P29699번_Welcome_to_SMUPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = "WelcomeToSMUPC";
        int N = Integer.parseInt(br.readLine()) - 1;
        System.out.println(data.charAt(N % 14));
    }
}