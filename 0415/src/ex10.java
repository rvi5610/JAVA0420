import java.util.Random;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int chance = 5;

		while (chance > 0) {

			int num1 = ran.nextInt(20);
			int num2 = ran.nextInt(20);
			System.out.print(num1 + "+" + num2 + "=");
			int input = sc.nextInt();

			if (num1 + num2 != input) {
				chance--;
				System.out.println("Fail");
			} else {
				System.out.println("Succes");
			}

		}
		System.out.println("Game over");
	}

}
