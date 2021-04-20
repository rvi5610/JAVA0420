import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 0;
		
		while(now > goal ) {
			week++;
			System.out.print(week+"주차 감량 몸무게 : ");
			int down = sc.nextInt();
			
			now -= down;
			
			}
			System.out.println(now +"달성 축하드립니다.");
		}
		
		
		

}


