import java.util.Scanner;

public class C10E4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int For = 0;
		int against = 0;
		int abstained = 0;
		int idx = 0;

		for (int i = 1; i <= 10; i++) {
			idx = idx + 1;
			System.out.println("hello country number " + i);
			System.out.println("vote for? press 1 :");
			System.out.println("vote against? press 2 :  ");
			System.out.println("abstained? press 3 : ");
			System.out.println("want to put a veto? press 4 :");
			int vote = scanner.nextInt();
			if (vote == 1) {
				For = For + 1;

			} else if (vote == 2) {
				against = against + 1;
			} else if (vote == 3) {
				abstained = abstained + 1;
			} else {
				System.out.println("country number " + idx + " put veto");
				break;
			}

			if (i == 10) {
				System.out.println("for " + For + " " + " against " + against + " " + " abstained " + abstained);
			}

		}

		scanner.close();
	}
}
