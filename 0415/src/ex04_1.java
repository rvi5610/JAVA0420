
public class ex04_1 {

	public static void main(String[] args) {
		
		for(int line =1; line<=5; line++) {
			for(int blank=5; blank>line; blank--) {
				System.out.print(" ");
			}
			for (int star=1; star<=line; star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}
}


