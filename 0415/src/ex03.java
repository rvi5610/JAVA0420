
public class ex03 {

	public static void main(String[] args) {

		for (int line = 0; line <= 4; line++) {

			for (int star = 4; star >= 0; star--) {

				if (line < star) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}

}
