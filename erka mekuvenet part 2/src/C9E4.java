import java.util.Scanner;

public class C9E4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;
		int sum = 0;
		System.out.println("pls insert a number : ");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
		scanner.close();
	}

}
