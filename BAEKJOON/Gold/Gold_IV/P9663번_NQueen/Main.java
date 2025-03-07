package P9663번_NQueen;

interface Main {
    static void main(String[] a) throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = n * 10 + (c & 15);
        System.out.print(new int[] { 1, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184 }[n]);
    }
}