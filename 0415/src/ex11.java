import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���̵� : ");
			String id = sc.next();
			System.out.print("��й�ȣ : ");
			String pw = sc.next();

			if (id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("�α��� ����");
				break;
			} else {
				System.out.println("�α��� ����");
			}
		}

	}

}
