import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		System.out.print((totalSecond/3600) + "시");
		System.out.print((totalSecond%3600/60) + "분");
		System.out.print((totalSecond%60) + "초");
		
	}

}
