import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ : ");
		int now = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();
		
		int week = 0;
		
		while(now > goal ) {
			week++;
			System.out.print(week+"���� ���� ������ : ");
			int down = sc.nextInt();
			
			now -= down;
			
			}
			System.out.println(now +"�޼� ���ϵ帳�ϴ�.");
		}
		
		
		

}


