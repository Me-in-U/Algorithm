package P17598번_Animal_King_Election;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L_Count = 0;
        for (int i = 0; i < 9; i++)
            if (br.readLine().charAt(0) == 'L')
                L_Count++;
        System.out.println(L_Count >= 5 ? "Lion" : "Tiger");
    }
}
