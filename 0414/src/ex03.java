import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// Scanner�� ���ؼ� ���� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		int num = sc.nextInt();

		switch (num) {
		case 10: // num�� 10�϶� ����
			System.out.println("10 �Դϴ�.");
			break; // switch�� ����
		case 9: // num�� 9�϶� ����
			System.out.println("9 �Դϴ�.");
			break;
		case 8:
			System.out.println("8 �Դϴ�.");
			break;
		case 7:
			System.out.println("7 �Դϴ�.");
		
		// 10,9,8,7�� �ƴ� ��
		default:
			System.out.println("10, 9, 8, 7 �ƴ�");
			break;
		}

	}

}
