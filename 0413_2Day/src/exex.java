import java.util.Scanner;

public class exex {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("����� ��ǰ ������ �Է��ϼ���");
		int num = in.nextInt();

		int item = 10000;

		if (num <= 10) {
			System.out.println("������" + num * item + "�Դϴ�.");
		}
		else {
			float dis_item = (num * item) * 0.9f;
			int dis_item1 = (int)dis_item;
			System.out.println("������" + dis_item1 + "�Դϴ�.");
		}
		
	}
}
