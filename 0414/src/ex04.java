import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		String season = "";

		switch (month) {
		case 12, 1, 2:
			season = "겨울";
			break;
		case 3, 4, 5:
			season = "봄";
			break;
		case 6, 7, 8:
			season = "여름";
			break;
		case 9, 10, 11:
			season = "가을";
			break;
			
		}
		System.out.println(season + "입니다.");
	}

}
