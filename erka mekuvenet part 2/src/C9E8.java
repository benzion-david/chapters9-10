import java.util.Scanner;

public class C9E8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("pls insert a numbar : ");
		int num = scanner.nextInt();
		int sum = 0;

		for (int i = 4; i < num; i++) {
			if (i % 4 == 0 || i % 7 == 0) {
				System.out.print(i+" ");
				sum = sum + i;
			}

		}
		System.out.println();
		System.out.println(sum);
		scanner.close();
	}

}
