package BAEKJOON.Bronze.Bronze_I.P11284번_초성_중성_종성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String[] initialSoundData = { "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ",
                                "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };
                String[] middleSoundData = { "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ",
                                "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ" };
                String[] finalSoundData = { "\n", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ",
                                "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };
                char single = br.readLine().charAt(0);
                int initialSound = ((single - 0xAC00) / 28) / 21;
                int middleSound = ((single - 0xAC00) / 28) % 21;
                int finalSound = ((single - 0xAC00)) % 28;
                StringBuilder sb = new StringBuilder();
                sb.append(initialSoundData[initialSound]).append('\n').append(middleSoundData[middleSound]).append('\n')
                                .append(finalSoundData[finalSound]);
                System.out.print(sb.toString());
        }
}