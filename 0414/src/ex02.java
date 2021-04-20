import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받기 위해 Scanner 받아오기
		
		System.out.print("실적액 입력 : ");
		int per = sc.nextInt(); // 실적 입력받기
		int bonus = 0; // 전역변수로 bonus 사용
		
		if (per <= 990000) {
			
		} else if (per < 1000000 && per < 1990000) {
			bonus = 200000;
		} else if (per < 2000000 && per < 2990000) {
			bonus = 300000;
		} else if (per >= 3000000) {
			bonus = 500000;
		}
		System.out.println("총 급여는 " + (per+bonus) + " 입니다.");
	}

}
