import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// while문으로 0이 입력되면 끝나는 반복문을 만들어보자
		int num = 0; // 정답

		while (true) {
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();

			if (input == num) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
