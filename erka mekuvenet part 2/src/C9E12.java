import java.util.Scanner;

public class C9E12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) {
			System.out.println("pls insert a number : ");
			int a = scanner.nextInt();
			if (a % 2 == 0) {
				System.out.println(a + " is even");

			} else {
				System.out.println(a + " is not even");
			}

		}
		scanner.close();
	}

}
