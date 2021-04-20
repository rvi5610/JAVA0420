package ExamFor;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("╢э ют╥б : ");
		int num = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}

	}

}
