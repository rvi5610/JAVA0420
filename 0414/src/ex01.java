import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		// grade �ȿ� ���� �Է��� ���� ����
		int grade = sc.nextInt();
		String score = ""; // ��𼭵� ����ִ� ����(��������)
		// �������̸� int num = 0;
		if (grade >= 90) {
			score = "A"; // if�� �ȿ����� ����ִ� ����
		} else if (80 <= grade && grade < 90) {
			score = "B";
		} else if (70 <= grade && grade < 80) {
			score = "C";
		}
		// if�� ����
		System.out.println(score+"�����Դϴ�.");
	}

}
