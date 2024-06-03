package Lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập vào số nguyên b: ");
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = -b / a;
			System.out.println("Nghiệm của phương trình là: " + x);
		}
		scanner.close();
	}
}
