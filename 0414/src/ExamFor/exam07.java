package ExamFor;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("��� ��� : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			
		}

	}

}
