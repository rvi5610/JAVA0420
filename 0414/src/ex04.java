import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		String season = "";

		switch (month) {
		case 12, 1, 2:
			season = "�ܿ�";
			break;
		case 3, 4, 5:
			season = "��";
			break;
		case 6, 7, 8:
			season = "����";
			break;
		case 9, 10, 11:
			season = "����";
			break;
			
		}
		System.out.println(season + "�Դϴ�.");
	}

}
