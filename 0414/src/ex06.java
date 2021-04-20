import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("user1 : ");
		String user1 = sc.nextLine();
		System.out.print("user2 : ");
		String user2 = sc.nextLine();

		System.out.print(user1 + "´Ô >> ");
		String x = sc.nextLine();
		System.out.print(user2 + "´Ô >> ");
		String y = sc.nextLine();

		// ¿©±â¼­ ¹®Á¦ ¤Ð¤Ð
		if (x == "°¡À§" && y == "°¡À§") {
			System.out.println("¹«½ÂºÎ!");
		} else if(x == "°¡À§" && y == "º¸") {
			System.out.println("½Â¸®!");
		} else if(x == "°¡À§" && y == "¹ÙÀ§") {
			System.out.println("½Â¸®!");
		}

	}

}
