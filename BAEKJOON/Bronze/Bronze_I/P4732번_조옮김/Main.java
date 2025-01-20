package P4732번_조옮김;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] twelveTone = { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" };
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] notes = br.readLine().split(" ");
            if (notes[0].charAt(0) == '*')
                break;
            int move = Integer.parseInt(br.readLine());
            for (String note : notes) {
                int index = (findIndex(note, twelveTone) + move + twelveTone.length) % twelveTone.length;
                sb.append(twelveTone[index]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb.toString().trim());
    }

    private static int findIndex(String note, String[] scale) {
        switch (note) {
            case "A":
                return 0;
            case "A#":
            case "Bb":
                return 1;
            case "B":
            case "Cb":
                return 2;
            case "C":
            case "B#":
                return 3;
            case "C#":
            case "Db":
                return 4;
            case "D":
                return 5;
            case "D#":
            case "Eb":
                return 6;
            case "E":
            case "Fb":
                return 7;
            case "F":
            case "E#":
                return 8;
            case "F#":
            case "Gb":
                return 9;
            case "G":
                return 10;
            case "G#":
            case "Ab":
                return 11;
            default:
                return -1;
        }
    }
}
