package BAEKJOON.Silver.Silver_II.P12891번_DNA_비밀번호;

interface Main {
    static void main(String[] a) throws Exception {
        int[] C = new int[85];
        int R = 0;
        int S = R();
        int P = R();
        byte[] D = new byte[S + 1];
        System.in.read(D);
        int T = 0;
        if ((C['A'] = R()) == 0)
            T++;
        if ((C['C'] = R()) == 0)
            T++;
        if ((C['G'] = R()) == 0)
            T++;
        if ((C['T'] = R()) == 0)
            T++;
        for (int i = 0; i < P; i++)
            if (--C[D[i]] == 0)
                T++;
        if (T == 4)
            R++;
        for (int i = P; i < S; i++) {
            if (++C[D[i - P]] == 1)
                T--;
            if (--C[D[i]] == 0)
                T++;
            if (T == 4)
                R++;
        }
        // 출력
        System.out.print(new StringBuilder().append(R));
    }

    // 그냥 정수 하나 읽기
    private static int R() throws Exception {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        return n;
    }
}