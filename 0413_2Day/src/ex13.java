import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�뵿 �ð��� ? : ");
		int hour = sc.nextInt();
		
		int basicHour = 8;
		int money = 5000;
		float overMoney = money * 1.5f;
		
		if(hour<=money) {
			System.out.print("�� �ӱ��� " + hour*money + "�� �Դϴ�.");
		} 
		else {
			int overHour = hour - money;
			float totalMoney = basicHour*money+overHour*overMoney;
			int totalMoney1 = (int)totalMoney;
			System.out.print("�� �ӱ��� " + totalMoney1 + "�� �Դϴ�.");
		}
		
		
	}

}
