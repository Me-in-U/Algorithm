package P16953번_AtoB;

interface Main_short {
	static void main(String[] a) throws Exception {
		int A = r(), B = r(), c = 1;
		while (A != B) {
			if (B < A) {
				c = -1;
				break;
			}
			if (B % 10 == 1) {
				B /= 10;
			} else if (B % 2 == 0) {
				B /= 2;
			} else {
				c = -1;
				break;
			}
			c++;
		}
		System.out.print(c);
	}

	static int r() throws Exception {
		int c;
		int n = System.in.read() & 15;
		while ((c = System.in.read()) >= 48)
			n = (n * 10) + (c & 15);
		return n;
	}
}