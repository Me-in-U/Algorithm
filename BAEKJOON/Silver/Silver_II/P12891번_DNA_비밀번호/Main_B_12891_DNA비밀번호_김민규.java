package P12891번_DNA_비밀번호;

/**
 * BAEKJOON ONLINE JUDGE
 * 2563번 DNA 비밀번호 SILVER II
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-22
 * JAVA8 : 메모리 18580 KB, 시간 136ms
 * JAVA11 : 메모리 17884 KB, 시간 184ms
 */

import java.io.IOException;

public class Main_B_12891_DNA비밀번호_김민규 {
    // (int)'T'까지 바로 저장
    // 메모리 희생, 속도 향상
    private static int[] currentCount = new int[85];
    private static int result = 0;

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        int S = readInt();
        int P = readInt();
        String DNA = readString();

        // 필요한 염기 수 입력
        currentCount['A'] = readInt();
        currentCount['C'] = readInt();
        currentCount['G'] = readInt();
        currentCount['T'] = readInt();

        // 초기 P개 문자 카운트
        for (int i = 0; i < P; i++)
            currentCount[DNA.charAt(i)]--;

        if (checkDNA()) {
            result++;
        }

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            currentCount[DNA.charAt(i - P)]++; // 왼쪽 문자 제거
            currentCount[DNA.charAt(i)]--; // 오른쪽 문자 추가
            if (checkDNA()) {
                result++;
            }
        }
        // 출력
        System.out.print(result);
    }

    /**
     * @return 필요한 염기수가 모두 0보다 작거나 같은가가
     */
    private static boolean checkDNA() {
        return currentCount['A'] <= 0 && currentCount['C'] <= 0 && currentCount['G'] <= 0 && currentCount['T'] <= 0;
    }

    // 그냥 정수 하나 읽기
    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }

    // 그냥 한 줄 읽기
    public static String readString() throws IOException {
        StringBuilder temp = new StringBuilder();
        int c;
        while ((c = System.in.read()) > 13) {
            temp.append((char) c);
        }
        return temp.toString();
    }
}