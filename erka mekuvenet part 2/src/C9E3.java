
import java.util.Scanner;

public class C9E3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		int number = 1;

		System.out.println("pls insert a number : ");
		num = scanner.nextInt();

		for (int i = 2; i <= num; i++) {
			number = number * i;
		}
		System.out.println(number);
		scanner.close();
	}

}
