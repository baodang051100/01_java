package Lab02;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");
		int value = scanner.nextInt();

		switch (value) {
		case 1: {
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
			break;
		}
		case 2: {
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
			break;
		}
		case 3: {
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
			break;
		}
		default:
			System.exit(0);
		}

	}
}
