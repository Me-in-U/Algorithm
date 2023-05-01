package P11718번_그대로_출력하기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(input);
		}
		sc.close();
	}
}