package P12891번_DNA_비밀번호;

/**
 * BAEKJOON ONLINE JUDGE
 * 2563번 DNA 비밀번호 SILVER II
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-22
 * JAVA8 : 메모리 18860 KB, 시간 152ms
 * JAVA11 : 메모리 18120 KB, 시간 204ms
 */

import java.io.IOException;

public class Main {
    private static int result = 0;
    private static int[] atLeast;
    private static int[] currentCount = new int[4];

    public static void main(String[] args) throws IOException {
        int S = readInt();
        int P = readInt();
        String DNA = readString();
        atLeast = new int[] { readInt(), readInt(), readInt(), readInt() };

        // 초기 P개 문자 카운트
        for (int i = 0; i < P; i++)
            currentCount[charToIndex(DNA.charAt(i))]++;
        checkDNA();

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            currentCount[charToIndex(DNA.charAt(i - P))]--; // 왼쪽 문자 제거
            currentCount[charToIndex(DNA.charAt(i))]++; // 오른쪽 문자 추가
            checkDNA();
        }
        // 출력
        System.out.print(result);
    }

    /**
     * 
     * @param c DNA 문자열 중에 문자 하나
     * @return 염기 A, C, G, T의 대응 되는 인덱스 0, 1, 2, 3
     */
    private static int charToIndex(char c) {
        return (c == 'A') ? 0 : (c == 'C') ? 1 : (c == 'G') ? 2 : 3;
    }

    // 부문 문자열의 염기수가 최소 개소를 만족하는지 확인
    // 만족시 result++
    private static void checkDNA() {
        for (int i = 0; i < 4; i++) {
            if (currentCount[i] < atLeast[i]) {
                return;
            }
        }
        result++;
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
        while ((c = System.in.read()) != 10 && c != -1) {
            temp.append((char) c);
        }
        if (c == 13)
            System.in.read();
        return temp.toString();
    }
}