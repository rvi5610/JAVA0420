import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("user1 : ");
		String user1 = sc.nextLine();
		System.out.print("user2 : ");
		String user2 = sc.nextLine();

		System.out.print(user1 + "�� >> ");
		String x = sc.nextLine();
		System.out.print(user2 + "�� >> ");
		String y = sc.nextLine();

		// ���⼭ ���� �Ф�
		if (x == "����" && y == "����") {
			System.out.println("���º�!");
		} else if(x == "����" && y == "��") {
			System.out.println("�¸�!");
		} else if(x == "����" && y == "����") {
			System.out.println("�¸�!");
		}

	}

}
