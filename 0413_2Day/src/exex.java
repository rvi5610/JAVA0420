import java.util.Scanner;

public class exex {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("사려는 상품 갯수를 입력하세요");
		int num = in.nextInt();

		int item = 10000;

		if (num <= 10) {
			System.out.println("가격은" + num * item + "입니다.");
		}
		else {
			float dis_item = (num * item) * 0.9f;
			int dis_item1 = (int)dis_item;
			System.out.println("가격은" + dis_item1 + "입니다.");
		}
		
	}
}
