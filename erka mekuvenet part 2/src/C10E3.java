import java.util.Scanner;

public class C10E3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 365; i++) {
			System.out.println("how much degrees ? : ");
			int Card = scanner.nextInt();
			if (Card < -5 || Card > 40) {
				System.out.println("invalid data");
				break;

			} else if (i == 365) {
				System.out.println("valid data");
			}

		}
		scanner.close();
	}

}
