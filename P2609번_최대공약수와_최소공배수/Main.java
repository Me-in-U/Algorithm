package P2609번_최대공약수와_최소공배수;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
    sc.close();    
		int d = gcd(a, b);
 
		System.out.println(d);
		System.out.println(a * b / d);
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;

			a = b;
			b = r;
		}
		return a;
	}
}