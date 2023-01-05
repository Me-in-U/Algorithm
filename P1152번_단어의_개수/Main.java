package P1152번_단어의_개수;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        if (sentence.isEmpty()) {
            System.out.println("0");
        } else {
            String[] words = sentence.split(" ");
            System.out.println(words.length);
        }

        sc.close();
    }
}