import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 합 : " + (num1+num2));
		System.out.println("두 수의 뺄셈 : " + (num1-num2));
		System.out.println("두 수의 곱 : " + (num1*num2));
		System.out.println("두 수의 나누기 : " + (num1/num2));

		
	}

}
