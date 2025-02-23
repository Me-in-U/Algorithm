package P21553번_암호_만들기;

interface Main {
    static void main(String[] a) throws Exception {
        int c;
        while (System.in.read() != 10)
            ;
        while ((c = System.in.read()) > 47)
            System.out.print(c & 15);
    }
}
