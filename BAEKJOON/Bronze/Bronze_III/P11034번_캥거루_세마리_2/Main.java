package P11034번_캥거루_세마리_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        String[] ABC;
        while ((line = br.readLine()) != null) {
            ABC = line.split(" ");
            int A = Integer.parseInt(ABC[0]);
            int B = Integer.parseInt(ABC[1]);
            int C = Integer.parseInt(ABC[2]);
            sb.append(Math.max(C - B - 1, B - A - 1)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
