import java.util.Scanner;

public class C9E2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a;
		int b;
		
		System.out.println("pls insert a number : ");
		a = scanner.nextInt();
		System.out.println("pls insert a number : ");
		b = scanner.nextInt();
		
		for (int i = a; i <= b ; i++) {
			System.out.print (i+" ");
			
		}

		scanner.close();
	}

}
