package P10930번_SHA_256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(encryptSHA256(str));

	}

	public static String encryptSHA256(String str) {
		String sha = "";

		try {
			MessageDigest sh = MessageDigest.getInstance("SHA-256");
			sh.update(str.getBytes());
			byte[] byteData = sh.digest();
			StringBuilder sb = new StringBuilder();
			for (byte byteDatum : byteData) {
				sb.append(Integer.toString((byteDatum & 0xff) + 0x100, 16).substring(1));
			}

			sha = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("암호화 에러-NoSuchAlgorithmException");
			sha = null;
		}
		return sha;
	}
}
