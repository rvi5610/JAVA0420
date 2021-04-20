import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("전자계산기 : ");
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
			System.out.print("불합격입니다.");
		}
		else {
			System.out.print("합격입니다.");
		}
		
		
		
		
	}

}
