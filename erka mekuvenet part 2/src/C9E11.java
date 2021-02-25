import java.util.Scanner;

import javax.net.ssl.CertPathTrustManagerParameters;

public class C9E11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("pls insert a number : ");
		int a = scanner.nextInt();
		System.out.println("pls insert a number : ");
		int b = scanner.nextInt();
		int tmp = 0;

		if (b < a) {
			tmp = a;
			a = b;
			b = tmp;
		}

		for (int i = a; i <= b; i++) {
			System.out.print(i+" ");
		}
		for (int i = b-1; i >= a ; i--) {
			System.out.print(i+" ");
		}
		scanner.close();
	}

}
