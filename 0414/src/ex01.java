import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		// grade 안에 내가 입력한 값이 저장
		int grade = sc.nextInt();
		String score = ""; // 어디서든 살아있는 변수(전역변수)
		// 정수형이면 int num = 0;
		if (grade >= 90) {
			score = "A"; // if문 안에서만 살아있는 변수
		} else if (80 <= grade && grade < 90) {
			score = "B";
		} else if (70 <= grade && grade < 80) {
			score = "C";
		}
		// if문 종료
		System.out.println(score+"학점입니다.");
	}

}
