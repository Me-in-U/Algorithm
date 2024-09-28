import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int move = 2;
        if (a == 0 || b == 0) {
            move = 1;
            if ((a == 0 && x == 0 && y < b) || (b == 0 && y == 0 && x < a)) {
                move = 3;
            }
        }
        System.out.println(move);
    }
}