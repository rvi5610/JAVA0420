import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0; // while안에서 사용할 변수를 미리 만들어놓음
		
		while (num<10) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();

		}
		System.out.println("종료되었습니다.");
	}

}
