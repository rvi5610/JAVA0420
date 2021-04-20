import java.util.Random;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int num = random.nextInt(20) + 1;
		// random.nextInt(20) > 0부터 19까지의 난수 출력
		// +1 > 1부터 출력하기 위해서

		while (true) {
			System.out.print("number : ");
			int input = sc.nextInt();

			if (num > input) {
				System.out.println("up");
			} else if (num < input) {
				System.out.println("down");
			} else {
				System.out.println("success!");
				break;
			}

		}

	}

}
