import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int totalScore = sc.nextInt();
		String score = "";
		
		switch (totalScore / 10) {
		case 9, 10:
			score = "A";
			break;
		case 8:
			score = "B";
			break;
		case 7:
			score = "C";
			break;
		default:
			score = "D";
			break;
		}
		System.out.println(score + "�����Դϴ�.");
	}

}
