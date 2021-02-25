import java.util.Scanner;

public class C9E7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("pls insert a number : ");
		int n = scanner.nextInt();
		int a = 2;
		for (int i = 1; i < n; i++) {
			System.out.print(i + " ");

		}
		System.out.println();
		for (int i = 1; i < n; i++) {
			System.out.print(i*a+" ");
			
		}
		scanner.close();
	}
}
