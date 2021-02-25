import java.util.Scanner;

public class C10E1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int big = 0;
		int number;
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("pls insert a number : ");
			int a = scanner.nextInt();
			number = a;
			if (number >= big) {
				big = number;
				count += 1;
				if (count == 10) {
					System.out.println("memuyan");
				}
			} else {
				System.out.println("lo memuyan");
				break;
			}

		}

		scanner.close();
	}

}
