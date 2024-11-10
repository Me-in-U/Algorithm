package P15181번_Beautiful_Music;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    protected static final String HURT = "Ouch! That hurts my ears.";
    protected static final String BEAUTIFUL = "That music is beautiful.";
    protected static final int[] beautifulIntervals = { 2, 4, 6 };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String notes = "";
        while ((notes = br.readLine()).charAt(0) != '#') {
            sb.append(checkBeautifulMusic(notes) ? HURT : BEAUTIFUL).append('\n');
        }
        System.out.print(sb.toString());
    }

    private static boolean checkBeautifulMusic(String notes) {
        int previousNote = notes.charAt(0) - 'A';
        for (int i = 1; i < notes.length(); i++) {
            int currentNote = notes.charAt(i) - 'A';
            int interval = (currentNote - previousNote + 7) % 7;
            boolean isBeautiful = false;
            for (int beautifulInterval : beautifulIntervals) {
                if (interval == beautifulInterval) {
                    isBeautiful = true;
                    break;
                }
            }
            if (!isBeautiful) {
                return false;
            }
            previousNote = currentNote;
        }
        return true;
    }
}