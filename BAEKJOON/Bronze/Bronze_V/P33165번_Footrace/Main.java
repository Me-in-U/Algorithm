package BAEKJOON.Bronze.Bronze_V.P33165번_Footrace;

interface Main {
    static void main(String[] a) throws Exception {
        int c, T = 0, V = 0;
        while ((c = System.in.read()) > 47)
            T = T * 10 + (c & 15);
        while ((c = System.in.read()) > 47)
            V = V * 10 + (c & 15);
        System.out.print(T * V);
    }
}
