import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		
		int result = ( x%5==0 ? x/5 : x/5+1 );
		
		System.out.println("�ʿ��� ������ �� : " + result);
		

	
	}

}
