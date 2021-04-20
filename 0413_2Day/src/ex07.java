import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 나이는 : ");
		int age = sc.nextInt();

		if (age >= 20) {
			System.out.print("성인입니다.");
		}
	}

}
