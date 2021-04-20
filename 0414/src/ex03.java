import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// Scanner를 통해서 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 10: // num이 10일때 실행
			System.out.println("10 입니다.");
			break; // switch문 종료
		case 9: // num이 9일때 실행
			System.out.println("9 입니다.");
			break;
		case 8:
			System.out.println("8 입니다.");
			break;
		case 7:
			System.out.println("7 입니다.");
		
		// 10,9,8,7이 아닐 때
		default:
			System.out.println("10, 9, 8, 7 아님");
			break;
		}

	}

}
