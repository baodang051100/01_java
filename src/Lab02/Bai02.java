package Lab02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập vào số nguyên b: ");
		int b = scanner.nextInt();
		System.out.println("Nhập vào số nguyên c: ");
		int c = scanner.nextInt();

		if (a == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				int x = -b * (2 / a);
				System.out.println("Phương trình thông báo nghiệm kép: " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm riêng biệt: " + x1 + " và " + x2);
			}
		}
		scanner.close();
	}
}
