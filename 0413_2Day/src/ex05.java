import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int x = sc.nextInt();
		
		
		int result = ( x%5==0 ? x/5 : x/5+1 );
		
		System.out.println("필요한 상자의 수 : " + result);
		

	
	}

}
