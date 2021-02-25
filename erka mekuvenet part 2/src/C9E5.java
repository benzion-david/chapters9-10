import java.util.Scanner;

public class C9E5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("pls insert a number : ");
		int a = scanner.nextInt();

		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				sum = sum + a;

			}
			System.out.println("pls insert a number : ");
			a = scanner.nextInt();

		}

		System.out.println("sum : " + sum);

		scanner.close();
	}

}
