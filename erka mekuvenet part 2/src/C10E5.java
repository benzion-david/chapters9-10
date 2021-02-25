import java.util.Scanner;

public class C10E5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 0; i <= 1000; i++) {
			System.out.println("pls insert a number : ");
			int Number = scanner.nextInt();
			if (Number < 1000) {
				sum1 = sum1 + Number;
				continue;
			}
			if (Number >= 1000 && Number < 2000) {
				sum2 = sum2 + Number;
				continue;
			}
			
			sum3 = sum3 + Number;

		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		scanner.close();
	}
}
