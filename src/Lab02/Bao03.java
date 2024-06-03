package Lab02;

import java.util.Scanner;

public class Bao03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số điện: ");
		int sodien = scanner.nextInt();
		int tiendien = 0;

		if (sodien >= 0 && sodien <= 100) {
			tiendien = sodien * 1000;
			System.out.println("Số tiền điện là: " + tiendien);
		} else {
			tiendien = 100 * 1000 + (sodien - 100) * 1500;
			System.out.println("Số tiền điện là: " + tiendien);
		}
	}
}
