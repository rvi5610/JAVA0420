package ExamFor;

public class exam08 {

	public static void main(String[] args) {

		for(int i = 2; i <= 30; i++) {
			System.out.print(i + "ÀÇ Á¤¼ö : ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}

			}
			System.out.println();
		}
	}

}
