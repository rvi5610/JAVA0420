import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��� ���ڴ� ? ");
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.println("3�� 5�� ����Դϴ�");
		}

	}

}
