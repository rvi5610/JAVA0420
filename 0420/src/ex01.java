public class ex01 {

	public static void main(String[] args) {

		System.out.println(plus(1, 2));
		System.out.println(plus(1.0, 1.2));

	}
	// 메소드 오버로딩

	private static int plus(int num1, int num2) {
		return num1 + num2;
	}

	private static double plus(double num1, double num2) {
		return num1 + num2;
	}

}