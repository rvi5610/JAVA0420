import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// while������ 0�� �ԷµǸ� ������ �ݺ����� ������
		int num = 0; // ����

		while (true) {
			System.out.print("���� �Է� : ");
			int input = sc.nextInt();

			if (input == num) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}

	}

}
