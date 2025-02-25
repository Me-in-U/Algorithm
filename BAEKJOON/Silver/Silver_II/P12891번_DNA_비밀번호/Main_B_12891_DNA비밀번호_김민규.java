package P12891번_DNA_비밀번호;

/**
 * BAEKJOON ONLINE JUDGE
 * 2563번 DNA 비밀번호 SILVER II
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-22
 * JAVA8 : 메모리 13748 KB, 시간 88ms
 * JAVA11 : 메모리 16420 KB, 시간 124ms
 */

import java.io.IOException;

public class Main_B_12891_DNA비밀번호_김민규 {
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        // (int)'T'까지 바로 저장
        // 메모리 희생, 속도 향상
        int[] ACGT_Count = new int[85];
        int result = 0;
        int S = readInt();
        int P = readInt();
        byte[] DNA = new byte[S + 1]; // 백준(Linux) 기준 LF 자리만 추가
        System.in.read(DNA);

        // 필요한 최소 염기 수 입력
        int satisfied = 0;
        if ((ACGT_Count['A'] = readInt()) == 0)
            satisfied++;
        if ((ACGT_Count['C'] = readInt()) == 0)
            satisfied++;
        if ((ACGT_Count['G'] = readInt()) == 0)
            satisfied++;
        if ((ACGT_Count['T'] = readInt()) == 0)
            satisfied++;

        // 초기 P개 문자 카운트
        for (int i = 0; i < P; i++)
            if (--ACGT_Count[DNA[i]] == 0)
                satisfied++;
        if (satisfied == 4)
            result++;

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            // 맨 앞 염기 제거 수 최소 필요 수가 1이면 만족 수 감소
            if (++ACGT_Count[DNA[i - P]] == 1)
                satisfied--;
            // 맨 뒤 염기 추가 후 최소 필요 수가 0이면 만족 수 증가
            if (--ACGT_Count[DNA[i]] == 0)
                satisfied++;
            // satisfied가 0이면, 즉 필요한 염기 수가 모두 0보다 작거나 같다면
            if (satisfied == 4)
                result++;
        }
        // 출력
        System.out.print(new StringBuilder().append(result));
    }

    // 그냥 정수 하나 읽기
    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        // 백준(Linux) 기준 CR 처리 안함
        // if (c == 13)
        // System.in.read();
        return n;
    }
}