import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int totalSecond = sc.nextInt();
		System.out.print((totalSecond/3600) + "��");
		System.out.print((totalSecond%3600/60) + "��");
		System.out.print((totalSecond%60) + "��");
		
	}

}
