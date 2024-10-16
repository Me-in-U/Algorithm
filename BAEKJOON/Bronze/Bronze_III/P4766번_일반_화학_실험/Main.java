package P4766번_일반_화학_실험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double previous_data = Double.parseDouble(br.readLine());
        double next_data = 0;
        while ((next_data = Double.parseDouble(br.readLine())) != 999) {
            sb.append(String.format("%.2f", next_data - previous_data)).append('\n');
            previous_data = next_data;
        }
        System.out.print(sb.toString());
    }
}