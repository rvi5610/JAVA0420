import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("���ڰ��� : ");
		int cal = sc.nextInt();
		System.out.print("OS : ");
		int os = sc.nextInt();
		System.out.print("data : ");
		int data = sc.nextInt();
		System.out.print("SW : ");
		int sw = sc.nextInt();
		
		int sum = db+cal+os+data+sw;

		if(sum<60 ||
				sw<8 && cal<8 && os<8 && data<8 && sw<8) {
			System.out.print("���հ��Դϴ�.");
		}
		else {
			System.out.print("�հ��Դϴ�.");
		}
		
		
		
		
	}

}
