
import java.util.Scanner;

public class C10E2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("pls insert a number : ");
		int num = scanner.nextInt();
		sum = sum + num;

		for (int i = 1; i <= 1000; i++) {
			System.out.println("pls insert a number : ");
			num = scanner.nextInt();
			if (num == sum) {
				System.out.println(num);
				break;
			}else {
				sum = sum + num;
			}
			if (i == 9) {
				System.out.println("not found");
				
			}
	

		}
	
		scanner.close();
	}

}
