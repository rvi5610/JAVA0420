import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.print(num1);
		}else {
			System.out.print(num2);
		}
		
		
		
	}

}
