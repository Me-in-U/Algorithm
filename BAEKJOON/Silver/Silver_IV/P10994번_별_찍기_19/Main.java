package P10994번_별_찍기_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println("*");
            return;
        }
        int edge = 2 * (n - 1);
        StringBuilder[] sb = new StringBuilder[edge];
        for (int i = 0; i < edge; i++)
            sb[i] = new StringBuilder();
        int indiv = 0;
        int row = edge;
        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < indiv; j++)
                sb[i].append("* ");
            if (i % 2 == 0) {
                for (int j = 0; j < row; j++)
                    sb[i].append('*');
                row -= 2;
                indiv++;
            } else {
                for (int j = 0; j < row; j++)
                    sb[i].append(' ');
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < edge; i++)
            result.append(sb[i]).append(i % 2 == 0 ? '*' : ' ').append(sb[i].reverse()).append('\n');
        for (int i = 0; i < edge; i++)
            result.append("* ");
        result.append("*\n");
        for (int i = edge - 1; i >= 0; i--)
            result.append(sb[i].reverse()).append(i % 2 == 0 ? '*' : ' ').append(sb[i].reverse()).append('\n');
        System.out.print(result.toString());
    }
}