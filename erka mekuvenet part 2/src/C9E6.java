import java.util.Scanner;

public class C9E6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("pls insert a number : ");
		int num = scanner.nextInt();
		int sum = 0;
		int tmp = 0;
		int a = 2;

		for (int i = 0; i <= num; i++) {
			tmp = (int) Math.pow(a, i);
			sum = sum + tmp;
		}
		System.out.println(sum);
		scanner.close();
	}

}
