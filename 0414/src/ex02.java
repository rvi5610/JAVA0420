import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // �Է¹ޱ� ���� Scanner �޾ƿ���
		
		System.out.print("������ �Է� : ");
		int per = sc.nextInt(); // ���� �Է¹ޱ�
		int bonus = 0; // ���������� bonus ���
		
		if (per <= 990000) {
			
		} else if (per < 1000000 && per < 1990000) {
			bonus = 200000;
		} else if (per < 2000000 && per < 2990000) {
			bonus = 300000;
		} else if (per >= 3000000) {
			bonus = 500000;
		}
		System.out.println("�� �޿��� " + (per+bonus) + " �Դϴ�.");
	}

}
