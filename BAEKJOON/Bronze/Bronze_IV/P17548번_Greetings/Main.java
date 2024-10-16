package P17548번_Greetings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 2 * (br.readLine().length() - 2);
        StringBuilder sb = new StringBuilder();
        sb.append('h');
        for (int i = 0; i < count; i++)
            sb.append('e');
        sb.append('y');
        System.out.print(sb.toString());
    }
}