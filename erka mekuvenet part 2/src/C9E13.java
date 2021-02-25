import java.util.Scanner;

public class C9E13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("pls insert a number : ");
			int a = scanner.nextInt();
			if (i % 2 == 0) {
				sum = sum + a;
			}

		}
		System.out.println(sum);

		scanner.close();
	}

}
