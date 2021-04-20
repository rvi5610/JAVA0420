
public class ex04 {

	public static void main(String[] args) {

		for (int line = 0; line < 5; line++) { // 5ÁÙ Ãâ·Â
			for (int blank = line; blank < 4; blank++) {
				System.out.print(" ");
			}
			for (int star = 0; star < 2*line + 2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int line = 5; line>0; line--) {
			for (int blank = line; blank<5; blank++) {
				System.out.print(" ");
			}
			for ( int star = 0; star<line*2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
